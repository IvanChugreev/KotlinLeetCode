class N1437_CheckIfAll1sAreAtLeastLengthKPlacesAway {
    fun kLengthApart(nums: IntArray, k: Int): Boolean {
        var prev = -k - 1
        for (i in nums.indices) {
            if (nums[i] == 1) {
                if (i - prev - 1 < k) {
                    return false
                }
                prev = i
            }
        }
        return true
    }
}