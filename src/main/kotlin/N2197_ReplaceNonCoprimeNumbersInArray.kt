import utils.gcd

class N2197_ReplaceNonCoprimeNumbersInArray {
    fun replaceNonCoprimes(nums: IntArray): List<Int> {
        val result = ArrayList<Int>()
        for (num in nums) {
            var lcmValue = num
            while (result.isNotEmpty()) {
                val prev = result.last()
                val gcdValue = gcd(prev, lcmValue)
                if (gcdValue == 1) {
                    break
                }
                result.removeLast()
                lcmValue = (prev / gcdValue) * lcmValue
            }
            result.add(lcmValue)
        }
        return result
    }
}