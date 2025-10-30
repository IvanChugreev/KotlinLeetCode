class N1526_MinimumNumberOfIncrementsOnSubarraysToFormATargetArray {
    fun minNumberOperations(target: IntArray): Int {
        var result = target[0]
        for (index in 1 until target.size) {
            val prevIndex = index - 1
            if (target[index] > target[prevIndex]) {
                result += target[index] - target[prevIndex]
            }
        }
        return result
    }
}