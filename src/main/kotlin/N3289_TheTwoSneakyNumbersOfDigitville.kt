class N3289_TheTwoSneakyNumbersOfDigitville {
    fun getSneakyNumbers(nums: IntArray): IntArray {
        val hasNumArray = BooleanArray(nums.size - 2)
        val result = IntArray(2)
        var index = 0
        for (num in nums) {
            if (hasNumArray[num]) {
                result[index++] = num
            } else {
                hasNumArray[num] = true
            }
        }
        return result
    }
}