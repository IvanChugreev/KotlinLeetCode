class N3254_FindThePowerOfKSizeSubarrays {
    fun resultsArray(nums: IntArray, k: Int): IntArray {
        if (k == 1) return nums
        val preK = k - 1
        val ans = IntArray(nums.size - preK)
        var cnt = 1
        var last = nums[0]
        (1..<preK).forEach {
            if (nums[it] == last + 1) ++cnt else cnt = 1
            last = nums[it]
        }
        (preK..<nums.size).forEachIndexed { j, i ->
            if (nums[i] == last + 1) ++cnt else cnt = 1
            ans[j] = if (cnt < k) -1 else nums[i]
            last = nums[i]
        }
        return ans
    }
}