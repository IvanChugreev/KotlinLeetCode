class N3542_MinimumOperationsToConvertAllElementsToZero {
    fun minOperations(nums: IntArray): Int {
        val stack = ArrayList<Int>()
        var result = 0
        for (num in nums) {
            while (stack.isNotEmpty() && num < stack.last()) {
                stack.removeLast()
                ++result
            }
            if (num != 0 && (stack.isEmpty() || num > stack.last())) {
                stack.add(num)
            }
        }
        return result + stack.size
    }
}