class N1975_MaximumMatrixSum {
    fun maxMatrixSum(matrix: Array<IntArray>): Long {
        var sum = 0L
        var cntNeg = 0
        var min = 100000
        matrix.forEach { row ->
            row.forEach {
                if (it < 0) {
                    min = minOf(min, -it)
                    sum -= it
                    ++cntNeg
                } else {
                    if (min > it) min = it
                    sum += it
                }
            }
        }
        return if (cntNeg and 1 == 1) sum - (min shl 1) else sum
    }
}