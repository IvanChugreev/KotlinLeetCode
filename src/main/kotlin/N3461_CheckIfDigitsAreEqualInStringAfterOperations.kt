class N3461_CheckIfDigitsAreEqualInStringAfterOperations {
    fun hasSameDigits(s: String): Boolean {
        val nums = IntArray(s.length) { s[it] - '0' }
        var len = nums.size
        while (len > 2) {
            var i = 0
            while (++i < len) {
                nums[i - 1] = (nums[i - 1] + nums[i]) % 10
            }
            --len
        }
        return nums[0] == nums[1]
    }
}