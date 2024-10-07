class N4_MedianOfTwoSortedArrays {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        if (nums1.size > nums2.size) {
            return findMedianSortedArrays(nums2, nums1)
        }
        val m = nums1.size
        val n = nums2.size
        var left = 0
        var right = m
        val halfLen = (m + n + 1) / 2
        while (left <= right) {
            val i = (left + right) / 2
            val j = halfLen - i
            if (i < m && nums2[j - 1] > nums1[i]) {
                left = i + 1
            } else if (i > 0 && nums1[i - 1] > nums2[j]) {
                right = i - 1
            } else {
                val maxOfLeft = when {
                    i == 0 -> nums2[j - 1]
                    j == 0 -> nums1[i - 1]
                    else -> maxOf(nums1[i - 1], nums2[j - 1])
                }
                if ((m + n) % 2 == 1) {
                    return maxOfLeft.toDouble()
                }
                val minOfRight = when {
                    i == m -> nums2[j]
                    j == n -> nums1[i]
                    else -> minOf(nums1[i], nums2[j])
                }
                return (maxOfLeft + minOfRight) / 2.0
            }
        }
        error("Input arrays are not sorted or invalid")
    }
}