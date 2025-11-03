class N1578_MinimumTimeToMakeRopeColorful {
    fun minCost(colors: String, neededTime: IntArray): Int {
        var minRemovalTime = 0
        for (i in 1 until neededTime.size) {
            if (colors[i] == colors[i - 1]) {
                minRemovalTime += minOf(neededTime[i], neededTime[i - 1])
                neededTime[i] = maxOf(neededTime[i], neededTime[i - 1])
            }
        }
        return minRemovalTime
    }
}