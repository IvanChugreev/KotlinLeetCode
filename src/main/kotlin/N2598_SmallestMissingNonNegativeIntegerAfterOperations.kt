class N2598_SmallestMissingNonNegativeIntegerAfterOperations {
    fun findSmallestInteger(nums: IntArray, value: Int): Int {
        val remainderCounts = IntArray(value)
        for (num in nums) {
            ++remainderCounts[((num % value) + value) % value]
        }
        var minRemainder = 0
        for (r in 0 until value) {
            if (remainderCounts[r] < remainderCounts[minRemainder]) {
                minRemainder = r
            }
        }
        return remainderCounts[minRemainder] * value + minRemainder
    }
}