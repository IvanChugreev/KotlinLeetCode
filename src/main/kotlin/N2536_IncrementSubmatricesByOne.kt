class N2536_IncrementSubmatricesByOne {
    fun rangeAddQueries(n: Int, queries: Array<IntArray>): Array<IntArray> {
        val result = Array(n) { IntArray(n) }
        for ((row1, col1, row2, col2) in queries) {
            ++result[row1][col1]
            val row2plus1 = row2 + 1
            val col2plus1 = col2 + 1
            if (col2plus1 < n) --result[row1][col2plus1]
            if (row2plus1 < n) --result[row2plus1][col1]
            if (col2plus1 < n && row2plus1 < n) ++result[row2plus1][col2plus1]
        }
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (i > 0) result[i][j] += result[i - 1][j]
                if (j > 0) result[i][j] += result[i][j - 1]
                if (i > 0 && j > 0) result[i][j] -= result[i - 1][j - 1]
            }
        }
        return result
    }
}