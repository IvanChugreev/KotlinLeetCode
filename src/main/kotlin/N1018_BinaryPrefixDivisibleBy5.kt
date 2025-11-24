class N1018_BinaryPrefixDivisibleBy5 {
    fun prefixesDivBy5(nums: IntArray): List<Boolean> {
        val result = ArrayList<Boolean>(nums.size)
        var currNum = 0
        for (num in nums) {
            currNum = ((currNum shl 1) or num) % 5
            result.add(currNum == 0)
        }
        return result
    }
}