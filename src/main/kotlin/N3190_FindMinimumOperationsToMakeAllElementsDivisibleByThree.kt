class N3190_FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    fun minimumOperations(nums: IntArray): Int = nums.count { it % 3 != 0 }
}