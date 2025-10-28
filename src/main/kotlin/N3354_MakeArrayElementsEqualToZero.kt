class N3354_MakeArrayElementsEqualToZero {
    fun countValidSelections(nums: IntArray): Int {
        var rightSum = 0
        for (num in nums) {
            rightSum += num
        }
        var leftSum = 0
        var result = 0
        for (num in nums) {
            if (num == 0) {
                when(rightSum - leftSum) {
                    0 -> result += 2
                    -1, 1 -> ++result
                }
            } else {
                leftSum += num
                rightSum -= num
            }
        }
        return result
    }
}