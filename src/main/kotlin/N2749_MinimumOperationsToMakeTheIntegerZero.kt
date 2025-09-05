class N2749_MinimumOperationsToMakeTheIntegerZero {
    fun makeTheIntegerZero(num1: Int, num2: Int): Int {
        var k = 1
        while (true) {
            val x = num1 - num2.toLong() * k
            when {
                x < k -> return -1
                k >= x.countOneBits() -> return k
                else -> ++k
            }
        }
    }
}