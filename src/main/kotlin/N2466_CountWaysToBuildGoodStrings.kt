class N2466_CountWaysToBuildGoodStrings {
    fun countGoodStrings(low: Int, high: Int, zero: Int, one: Int): Int {
        val dp = IntArray(high + 1)
        dp[0] = 1
        val mod = 1000000007
        (0..high - minOf(zero, one)).forEach {
            if (it + zero <= high) dp[it + zero] = (dp[it + zero] + dp[it]) % mod
            if (it + one <= high) dp[it + one] = (dp[it + one] + dp[it]) % mod
        }
        var count = 0
        (low..high).forEach { count = (count + dp[it]) % mod }
        return count
    }
}