class N3350_AdjacentIncreasingSubarraysDetection2 {
    fun maxIncreasingSubarrays(nums: List<Int>): Int {
        var currentIncLength = 1
        var previousIncLength = 0
        var maxSubarrayLength = 0
        for (i in 1 until nums.size) {
            if (nums[i] > nums[i - 1]) {
                ++currentIncLength
            } else {
                previousIncLength = currentIncLength
                currentIncLength = 1
            }
            val combinedLength = maxOf(
                currentIncLength shr 1,
                minOf(previousIncLength, currentIncLength)
            )
            if (combinedLength > maxSubarrayLength) {
                maxSubarrayLength = combinedLength
            }
        }
        return maxSubarrayLength
    }
}