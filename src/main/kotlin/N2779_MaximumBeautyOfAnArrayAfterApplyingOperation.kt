class N2779_MaximumBeautyOfAnArrayAfterApplyingOperation {
    fun maximumBeauty(nums: IntArray, k: Int): Int {
        if (nums.size == 1) return 1
        if (k == 0) {
            val frequency = HashMap<Int, Int>()
            nums.forEach { frequency[it] = frequency.getOrDefault(it, 0) + 1 }
            return frequency.values.max()
        }
        val max = nums.max()
        val count = IntArray(max + 1)
        nums.forEach {
            ++count[maxOf(it - k, 0)]
            --count[minOf(it + k + 1, max)]
        }
        var sum = 0
        var maxSum = 0
        count.forEach {
            sum += it
            if (maxSum < sum) maxSum = sum
        }
        return maxSum
    }
}