class N2070_MostBeautifulItemForEachQuery {
    fun maximumBeauty(items: Array<IntArray>, queries: IntArray): IntArray {
        fun binarySearch(targetPrice: Int): Int {
            var l = 0
            var r = items.lastIndex
            while (l <= r) {
                val mid = (l + r) shr 1
                if (items[mid][0] > targetPrice) r = mid - 1 else l = mid + 1
            }
            return if (--l == -1) 0 else items[l][1]
        }
        items.sortBy { it[0] }
        var max = items[0][1]
        items.forEach {
            if (max < it[1]) max = it[1]
            it[1] = max
        }
        return IntArray(queries.size) { index -> binarySearch(queries[index]) }
    }
}