class N494_TargetSum {
    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        val totalSum = nums.sum()
        if (totalSum + target < 0 || (totalSum + target) and 1 == 1) return 0
        val subSet = (totalSum + target) shr 1
        val dp = IntArray(subSet + 1)
        dp[0] = 1
        nums.forEach { num -> (subSet downTo num).forEach { dp[it] += dp[it - num] } }
        return dp[subSet]
    }
}