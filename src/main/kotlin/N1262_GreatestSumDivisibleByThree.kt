class N1262_GreatestSumDivisibleByThree {
    fun maxSumDivThree(nums: IntArray): Int {
        val min = IntArray(4) { 10001 }
        var divSum = 0
        var notDivSum = 0
        for (num in nums) {
            val rem = num % 3
            if (rem == 0) {
                divSum += num
            } else {
                notDivSum += num
                val index = if (rem == 1) 0 else rem
                if (num < min[index]) {
                    min[index + 1] = min[index]
                    min[index] = num
                } else if (num < min[index + 1]) {
                    min[index + 1] = num
                }
            }
        }
        val totalSum = divSum + notDivSum
        return when (totalSum % 3) {
            0 -> totalSum
            1 -> maxOf(totalSum - min[0], totalSum - min[2] - min[3], divSum)
            else -> maxOf(totalSum - min[0] - min[1], totalSum - min[2], divSum)
        }
    }
}