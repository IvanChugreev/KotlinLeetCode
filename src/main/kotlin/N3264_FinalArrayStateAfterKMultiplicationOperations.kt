class N3264_FinalArrayStateAfterKMultiplicationOperations {
    fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
        repeat(k) { nums[nums.indices.minBy { nums[it] }] *= multiplier }
        return nums
    }
}