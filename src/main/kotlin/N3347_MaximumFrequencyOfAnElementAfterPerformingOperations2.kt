class N3347_MaximumFrequencyOfAnElementAfterPerformingOperations2 {
    fun maxFrequency(nums: IntArray, k: Int, numOperations: Int): Int {
        nums.sort()
        val k2 = k shl 1
        var i = 0
        var result = 0
        var leftStart = 0
        var midStart = 0
        var midEnd = 0
        while (i < nums.size) {
            while (k2 < nums[i] - nums[leftStart]) {
                ++leftStart
            }
            while (k < nums[i] - nums[midStart]) {
                ++midStart
            }
            val currentValue = nums[i]
            val oldI = i
            while (i < nums.size && nums[i] == currentValue) {
                ++i
            }
            while (midEnd < nums.size && nums[midEnd] - currentValue <= k) {
                ++midEnd
            }
            result = maxOf(
                result,
                minOf(midEnd - midStart, i - oldI + numOperations),
                minOf(i - leftStart, numOperations),
            )
        }
        return result
    }
}