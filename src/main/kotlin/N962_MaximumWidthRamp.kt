class N962_MaximumWidthRamp {
    fun maxWidthRamp(nums: IntArray): Int {
        val rightMax = IntArray(nums.size)
        rightMax[nums.lastIndex] = nums.last()
        for (i in nums.size - 2 downTo 0) { rightMax[i] = maxOf(rightMax[i + 1], nums[i]) }
        var left = 0
        var right = 0
        var maxWidth = 0
        while (right < nums.size) {
            while (left < right && nums[left] > rightMax[right]) { ++left }
            maxWidth = maxOf(maxWidth, right - left)
            ++right
        }
        return maxWidth
    }
}