class N3349_AdjacentIncreasingSubarraysDetection {
    fun hasIncreasingSubarrays(nums: List<Int>, k: Int): Boolean {
        var prevLen = 0
        var start = 0
        for (i in 1..nums.size) {
            if (i == nums.size || nums[i] <= nums[i - 1]) {
                val len = i - start
                if (prevLen >= k && len >= k || len >= 2 * k) {
                    return true
                }
                prevLen = len
                start = i
            }
        }
        return false
    }
}