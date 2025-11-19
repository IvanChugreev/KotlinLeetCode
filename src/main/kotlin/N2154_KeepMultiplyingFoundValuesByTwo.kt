class N2154_KeepMultiplyingFoundValuesByTwo {
    fun findFinalValue(nums: IntArray, original: Int): Int {
        val containsOriginal = BooleanArray(10)
        for (num in nums) {
            if (num % original == 0) {
                val rem = num / original
                if (rem and (rem - 1) == 0) {
                    containsOriginal[rem.countTrailingZeroBits()] = true
                }
            }
        }
        var index = 0
        while (index < 10 && containsOriginal[index]) {
            ++index
        }
        return original shl index
    }
}