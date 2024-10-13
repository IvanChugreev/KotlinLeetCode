import java.util.TreeMap

class N2406_DivideIntervalsIntoMinimumNumberOfGroups {
    fun minGroups(intervals: Array<IntArray>): Int {
        var rangeStart = Int.MAX_VALUE
        var rangeEnd = Int.MIN_VALUE
        for (interval in intervals) {
            rangeStart = minOf(rangeStart, interval[0])
            rangeEnd = maxOf(rangeEnd, interval[1])
        }
        return if (rangeEnd - rangeStart <= intervals.size) solveWithoutOrderedContainer(
            intervals,
            rangeStart,
            rangeEnd
        ) else solveWithOrderedContainer(intervals)
    }

    private fun solveWithoutOrderedContainer(intervals: Array<IntArray>, rangeStart: Int, rangeEnd: Int): Int {
        val n = rangeEnd - rangeStart
        val pointToCount = IntArray(n + 2)
        for (interval in intervals) {
            ++pointToCount[interval[0] - rangeStart]
            --pointToCount[interval[1] - rangeStart + 1]
        }
        var concurrentIntervals = 0
        var maxConcurrentIntervals = 0
        for (i in 0..n) {
            concurrentIntervals += pointToCount[i]
            maxConcurrentIntervals = maxOf(maxConcurrentIntervals, concurrentIntervals)
        }
        return maxConcurrentIntervals
    }

    private fun solveWithOrderedContainer(intervals: Array<IntArray>): Int {
        val pointToCount = TreeMap<Int, Int>()
        for (interval in intervals) {
            pointToCount[interval[0]] = pointToCount.getOrDefault(interval[0], 0) + 1
            pointToCount[interval[1] + 1] = pointToCount.getOrDefault(interval[1] + 1, 0) - 1
        }
        var concurrentIntervals = 0
        var maxConcurrentIntervals = 0
        for ((_, value) in pointToCount) {
            concurrentIntervals += value
            maxConcurrentIntervals = maxOf(maxConcurrentIntervals, concurrentIntervals)
        }
        return maxConcurrentIntervals
    }
}