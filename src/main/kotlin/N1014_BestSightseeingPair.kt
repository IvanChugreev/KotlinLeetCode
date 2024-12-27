class N1014_BestSightseeingPair {
    fun maxScoreSightseeingPair(values: IntArray): Int {
        var currMaxCost = values[0] - 1
        var max = 0
        (1..<values.size).forEach {
            max = maxOf(max, currMaxCost + values[it])
            currMaxCost = maxOf(currMaxCost, values[it]) - 1
        }
        return max
    }
}