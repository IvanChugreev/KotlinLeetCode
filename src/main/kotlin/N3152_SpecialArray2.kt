class N3152_SpecialArray2 {
    fun isArraySpecial(nums: IntArray, queries: Array<IntArray>): BooleanArray {
        val maxReach = IntArray(nums.size)
        var ind = 0
        while (ind < nums.size) {
            val startInd = ind
            maxReach[ind] = ind++
            while (ind < nums.size && nums[ind - 1] and 1 != nums[ind] and 1) maxReach[ind++] = startInd
        }
        return BooleanArray(queries.size) { maxReach[queries[it][1]] <= queries[it][0] }
    }
}