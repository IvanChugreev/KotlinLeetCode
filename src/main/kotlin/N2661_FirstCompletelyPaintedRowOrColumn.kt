class N2661_FirstCompletelyPaintedRowOrColumn {
    fun firstCompleteIndex(arr: IntArray, mat: Array<IntArray>): Int {
        val numToIndex = HashMap<Int, Int>()
        arr.indices.forEach { numToIndex[arr[it]] = it }
        return minOf(
            mat.minOf { row -> row.maxOf { numToIndex[it]!! } },
            mat[0].indices.minOf { col -> mat.maxOf { numToIndex[it[col]]!! } }
        )
    }
}