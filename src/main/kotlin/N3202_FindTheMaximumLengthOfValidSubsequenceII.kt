class N3202_FindTheMaximumLengthOfValidSubsequenceII {
    fun maximumLength(nums: IntArray, k: Int): Int {
        val dp = Array(k) { IntArray(k) }
        var score = 0
        nums.forEach { num ->
            val remains = num % k
            repeat(k) {
                dp[it][remains] = dp[remains][it] + 1
                score = maxOf(score, dp[it][remains])
            }
        }
        return score
    }
}