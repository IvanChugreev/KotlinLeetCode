class N27_RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var i = 0
        var j = nums.indexOfLast { it != `val` }
        while (i < j) {
            if (nums[i] == `val`) {
                nums[i] = nums[j]
                while (--j > i) {
                    if (nums[j] != `val`) {
                        break
                    }
                }
            }
            ++i
        }
        return j + 1
    }
}