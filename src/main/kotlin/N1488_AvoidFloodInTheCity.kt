class N1488_AvoidFloodInTheCity {
    fun avoidFlood(rains: IntArray): IntArray {
        val availableDays = UnionFind(rains.size + 1)
        val lastRainDayByLake = mutableMapOf<Int, Int>()
        val result = IntArray(rains.size) { 1 }
        for (i in rains.indices) {
            val lake = rains[i]
            if (lake == 0) continue
            result[i] = -1
            availableDays.union(i)
            if (lake in lastRainDayByLake) {
                val prevRainDay = lastRainDayByLake[lake]!!
                val dryDay = availableDays.find(prevRainDay + 1)
                if (dryDay >= i) return intArrayOf()
                result[dryDay] = lake
                availableDays.union(dryDay)
            }
            lastRainDayByLake[lake] = i
        }
        return result
    }

    private class UnionFind(size: Int) {
        private val parent = IntArray(size + 1) { it }

        fun find(i: Int): Int {
            if (parent[i] == i) return i
            parent[i] = find(parent[i])
            return parent[i]
        }

        fun union(i: Int) {
            parent[i] = find(i + 1)
        }
    }
}