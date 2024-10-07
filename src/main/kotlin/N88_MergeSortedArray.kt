class N88_MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m - 1
        var j = n - 1
        var k = n + i
        while (i > -1 && j > -1) {
            nums1[k--] = if (nums1[i] > nums2[j]) nums1[i--] else nums2[j--]
        }
        while (i > -1) {
            nums1[k--] = nums1[i--]
        }
        while (j > -1) {
            nums1[k--] = nums2[j--]
        }
    }
}