class N2054_TwoBestNonOverlappingEvents {
    fun maxTwoEvents(events: Array<IntArray>): Int {
        val times = ArrayList<IntArray>()
        events.forEach {
            times.add(intArrayOf(it[0], 1, it[2]))
            times.add(intArrayOf(it[1] + 1, 0, it[2]))
        }
        times.sortWith { a: IntArray, b: IntArray ->
            val compareResult = a[0].compareTo(b[0])
            if (compareResult == 0) a[1].compareTo(b[1]) else compareResult
        }
        var ans = 0
        var maxValue = 0
        times.forEach { if (it[1] == 1) ans = maxOf(ans, it[2] + maxValue) else maxValue = maxOf(maxValue, it[2]) }
        return ans
    }
}