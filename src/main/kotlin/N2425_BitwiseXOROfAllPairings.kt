class N2425_BitwiseXOROfAllPairings {
    fun xorAllNums(nums1: IntArray, nums2: IntArray): Int {
        var result = 0
        if (nums1.size and 1 == 1) result = nums2.fold(result) { acc, num -> acc xor num }
        if (nums2.size and 1 == 1) result = nums1.fold(result) { acc, num -> acc xor num }
        return result
    }
}