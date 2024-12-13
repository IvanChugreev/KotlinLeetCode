class N2593_FindScoreOfAnArrayAfterMarkingAllElements {
    fun findScore(nums: IntArray): Long {
        val sorted = Array(nums.size) { IntArray(2) }
        nums.indices.forEach {
            sorted[it][0] = nums[it]
            sorted[it][1] = it
        }
        sorted.sortWith { arr1: IntArray, arr2: IntArray ->
            val compareResult = arr1[0] - arr2[0]
            if (compareResult == 0) arr1[1] - arr2[1] else compareResult
        }
        var ans = 0L
        val marked = BooleanArray(nums.size)
        val lastIndex = nums.lastIndex
        sorted.forEach {
            if (!marked[it[1]]) {
                ans += it[0]
                marked[it[1]] = true
                if (it[1] != 0) marked[it[1] - 1] = true
                if (it[1] != lastIndex) marked[it[1] + 1] = true
            }
        }
        return ans
    }
}