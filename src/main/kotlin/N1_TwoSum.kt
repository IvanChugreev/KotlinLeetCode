class N1_TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val previousNumbers = mutableMapOf<Int, Int>()
        nums.forEachIndexed { i, num ->
            previousNumbers[target - num]?.let { return intArrayOf(it, i) }
            previousNumbers[num] = i
        }
        error("No solution found")
    }
}