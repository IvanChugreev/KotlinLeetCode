class N2327_NumberOfPeopleAwareOfASecret {

    private val mod = 1_000_000_007

    fun peopleAwareOfSecret(n: Int, delay: Int, forget: Int): Int {
        val dp = LongArray(n + 1)
        dp[1] = 1L
        var windowSum = 0L
        (2..n).forEach {
            val enterInd = it - delay
            val exitInd = it - forget
            if (enterInd > 0) {
                windowSum = (windowSum + dp[enterInd]) % mod
            }
            if (exitInd > 0) {
                windowSum = (windowSum - dp[exitInd] + mod) % mod
            }
            dp[it] = windowSum
        }
        return (maxOf(1, n - forget + 1)..n).fold(0L) { acc, ind -> (acc + dp[ind]) % mod }.toInt()
    }
}