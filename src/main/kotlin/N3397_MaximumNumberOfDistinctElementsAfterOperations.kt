class N3397_MaximumNumberOfDistinctElementsAfterOperations {
    fun maxDistinctElements(nums: IntArray, k: Int): Int {
        nums.sort()
        var count = 0
        var prev = Int.MIN_VALUE shr 1
        for (num in nums) {
            val curr = maxOf(prev + 1, num - k)
            if (curr <= num + k) {
                ++count
                prev = curr
            }
        }
        return count
    }
}