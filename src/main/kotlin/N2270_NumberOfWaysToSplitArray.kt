class N2270_NumberOfWaysToSplitArray {
    fun waysToSplitArray(nums: IntArray): Int {
        var rightSum = nums.sumOf { it.toLong() }
        var leftSum = 0L
        var result = 0
        (0..<nums.lastIndex).forEach {
            leftSum += nums[it]
            rightSum -= nums[it]
            if (leftSum >= rightSum) ++result
        }
        return result
    }
}