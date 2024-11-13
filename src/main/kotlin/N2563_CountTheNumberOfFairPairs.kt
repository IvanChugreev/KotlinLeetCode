class N2563_CountTheNumberOfFairPairs {
    fun countFairPairs(nums: IntArray, lower: Int, upper: Int): Long {
        fun lowerBound(value: Int): Long {
            var left = 0
            var right = nums.lastIndex
            var result = 0L
            while (left < right) {
                val sum = nums[left] + nums[right]
                if (sum < value) {
                    result += right - left
                    ++left
                } else {
                    --right
                }
            }
            return result
        }
        nums.sort()
        return lowerBound(upper + 1) - lowerBound(lower)
    }
}