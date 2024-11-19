class N2461_MaximumSumOfDistinctSubarraysWithLengthK {
    fun maximumSubarraySum(nums: IntArray, k: Int): Long {
        var maxSum = 0L
        var currSum = 0L
        var begin = 0
        var end = 0
        val numToIndex = HashMap<Int, Int>(k * 4 / 3 + 2)
        while (end < nums.size) {
            val lastOccurrence = numToIndex.getOrDefault(nums[end], -1)
            while (begin <= lastOccurrence || end - begin + 1 > k) {
                numToIndex.remove(nums[begin])
                currSum -= nums[begin]
                ++begin
            }
            numToIndex[nums[end]] = end
            currSum += nums[end]
            if (++end - begin == k && currSum > maxSum) maxSum = currSum
        }
        return maxSum
    }
}