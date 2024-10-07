class N80_RemoveDuplicatesFromSortedArray2 {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        var isUnique = true
        for (j in 1..nums.lastIndex) {
            if (nums[i] == nums[j]) {
                if (isUnique) {
                    nums[++i] = nums[j]
                    isUnique = false
                }
            } else {
                nums[++i] = nums[j]
                isUnique = true
            }
        }
        return i + 1
    }
}