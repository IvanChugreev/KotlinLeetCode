class N26_RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        for (j in 1..nums.lastIndex) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j]
            }
        }
        return i + 1
    }
}