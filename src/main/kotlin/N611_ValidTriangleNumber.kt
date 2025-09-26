class N611_ValidTriangleNumber {
    fun triangleNumber(nums: IntArray): Int {
        nums.sort()
        var count = 0
        for (i in nums.lastIndex downTo 2) {
            var leftIndex = 0
            var rightIndex = i - 1
            while (rightIndex > leftIndex) {
                if (nums[leftIndex] + nums[rightIndex] <= nums[i]) {
                    ++leftIndex
                } else {
                    count += rightIndex - leftIndex
                    --rightIndex
                }
            }
        }
        return count
    }
}