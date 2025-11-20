class N757_SetIntersectionSizeAtLeastTwo {
    fun intersectionSizeTwo(intervals: Array<IntArray>): Int {
        val recentTwo = intArrayOf(-2, -1)
        var result = 0
        intervals.sortBy { it[1] }
        for (interval in intervals) {
            if (recentTwo[1] < interval[0]) {
                recentTwo[0] = interval[1] - 1
                recentTwo[1] = interval[1]
                result += 2
            } else if (recentTwo[0] < interval[0]) {
                recentTwo[0] = minOf(recentTwo[1], interval[1] - 1)
                recentTwo[1] = interval[1]
                ++result
            }
        }
        return result
    }
}