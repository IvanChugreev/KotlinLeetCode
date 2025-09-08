class N1317_ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    fun getNoZeroIntegers(n: Int): IntArray {
        var i = 1
        var j = n - 1
        while (i <= j) {
            if (isNonZeroOptimized(i) && isNonZeroOptimized(j)) {
                return intArrayOf(i, j)
            }
            ++i
            --j
        }
        error("No non-zero integers found for n=$n")
    }

    fun isNonZeroOptimized(n: Int): Boolean {
        var num = n
        while (num > 0) {
            if (num % 10 == 0) {
                return false
            }
            num /= 10
        }
        return true
    }
}