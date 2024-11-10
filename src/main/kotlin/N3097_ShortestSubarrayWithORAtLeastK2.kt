class N3097_ShortestSubarrayWithORAtLeastK2 {
    fun minimumSubarrayLength(nums: IntArray, k: Int): Int {
        var minLength = Int.MAX_VALUE
        var i = 0
        var j = 0
        val bitCounts = IntArray(30)
        while (i < nums.size) {
            updateBitCounts(bitCounts, nums[i], 1)
            while (j <= i && convertBitCountsToNumber(bitCounts) >= k) {
                minLength = minOf(minLength, i - j + 1)
                updateBitCounts(bitCounts, nums[j], -1)
                ++j
            }
            ++i
        }
        return if (minLength == Int.MAX_VALUE) -1 else minLength
    }

    private fun updateBitCounts(bitCounts: IntArray, number: Int, delta: Int) {
        var num = number
        var i = 0
        while (num > 0) {
            if (num and 1 == 1) bitCounts[i] += delta
            num = num shr 1
            ++i
        }
    }

    private fun convertBitCountsToNumber(bitCounts: IntArray): Int {
        var result = 0
        var mask = 1
        bitCounts.forEach {
            if (it != 0) result = result or mask
            mask = mask shl 1
        }
        return result
    }
}