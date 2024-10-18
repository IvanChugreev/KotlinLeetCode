class N2044_CountNumberOfMaximumBitwiseORSubsets {
    fun countMaxOrSubsets(nums: IntArray): Int {
        val maxOr = nums.reduce { a, b -> a or b }
        var numberOfBadSubsets = 0
        var mask = maxOr
        while (mask > 0) {
            val cnt = nums.count { (it and mask) == 0 }
            numberOfBadSubsets += if ((Integer.bitCount(mask) and 1) == 1) (1 shl cnt) - 1 else 1 - (1 shl cnt)
            mask = (mask - 1) and maxOr
        }
        return (1 shl nums.size) - 1 - numberOfBadSubsets
    }
}