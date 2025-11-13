import utils.gcd

class N2654_MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1 {
    fun minOperations(nums: IntArray): Int {
        val ones = nums.count { it == 1 }
        if (ones > 0) return nums.size - ones
        val gcd = IntArray(nums.size) { nums[it] }
        for (offset in 1 until nums.size) {
            for (i in 0 until nums.size - offset) {
                gcd[i] = gcd(gcd[i], nums[i + offset])
                if (gcd[i] == 1) return offset + nums.size - 1
            }
        }
        return -1
    }
}