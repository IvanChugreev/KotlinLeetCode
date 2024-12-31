class N983_MinimumCostForTickets {
    fun mincostTickets(days: IntArray, costs: IntArray): Int {
        val lastDay = days[days.size - 1]
        val dp = IntArray(lastDay + 1)
        var cnt = 0
        (1..lastDay).forEach {
            if (it < days[cnt]) {
                dp[it] = dp[it - 1]
            } else {
                dp[it] = minOf(
                    dp[it - 1] + costs[0],
                    dp[maxOf(0, it - 7)] + costs[1],
                    dp[maxOf(0, it - 30)] + costs[2]
                )
                ++cnt
            }
        }
        return dp[lastDay]
    }
}