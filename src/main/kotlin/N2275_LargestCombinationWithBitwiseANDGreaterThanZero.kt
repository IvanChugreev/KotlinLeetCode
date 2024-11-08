class N2275_LargestCombinationWithBitwiseANDGreaterThanZero {
    fun largestCombination(candidates: IntArray): Int {
        var max = 1
        (0..23).forEach { bitNumber ->
            val mask = 1 shl bitNumber
            val curr = candidates.count { it and mask != 0 }
            if (max < curr) max = curr
        }
        return max
    }
}