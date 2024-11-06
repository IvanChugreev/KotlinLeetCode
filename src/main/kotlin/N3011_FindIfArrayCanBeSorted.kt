class N3011_FindIfArrayCanBeSorted {
    fun canSortArray(nums: IntArray): Boolean {
        var prevMax = 0
        var currMin = nums[0]
        var currMax = nums[0]
        var lastBitCnt = nums[0].countOneBits()
        (1..<nums.size).forEach {
            val currBitCnt = nums[it].countOneBits()
            if (currBitCnt == lastBitCnt) {
                if (nums[it] > currMax) currMax = nums[it] else if (nums[it] < currMin) currMin = nums[it]
            } else {
                if (currMin < prevMax) return false
                prevMax = currMax
                currMin = nums[it]
                currMax = nums[it]
                lastBitCnt = currBitCnt
            }
        }
        return currMin > prevMax
    }
}