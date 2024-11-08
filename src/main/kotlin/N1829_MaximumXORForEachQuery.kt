class N1829_MaximumXORForEachQuery {
    fun getMaximumXor(nums: IntArray, maximumBit: Int): IntArray {
        val mask = (1 shl maximumBit) - 1
        val ans = IntArray(nums.size)
        var currXOR = nums[0]
        var i = ans.lastIndex
        ans[i--] = currXOR xor mask
        (1..<nums.size).forEach {
            currXOR = nums[it] xor currXOR
            ans[i--] = currXOR xor mask
        }
        return ans
    }
}