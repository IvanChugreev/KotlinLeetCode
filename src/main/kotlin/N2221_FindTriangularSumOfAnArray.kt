class N2221_FindTriangularSumOfAnArray {
    fun triangularSum(nums: IntArray): Int {
        val lastIndex = nums.lastIndex
        for (i in 1..lastIndex) {
            for (j in 0..<nums.size - i) {
                nums[j] = (nums[j] + nums[j + 1]) % 10
            }
        }
        return nums[0]
    }
}