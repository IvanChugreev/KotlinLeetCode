class N1072_FlipColumnsForMaximumNumberOfEqualRows {
    fun maxEqualRowsAfterFlips(matrix: Array<IntArray>): Int {
        val patternFrequency = HashMap<String, Int>()
        matrix.forEach { row ->
            val patternBuilder = StringBuilder("")
            row.forEach { patternBuilder.append(if (row[0] == it) "T" else "F") }
            val rowPattern = patternBuilder.toString()
            patternFrequency[rowPattern] = patternFrequency.getOrDefault(rowPattern, 0) + 1
        }
        return patternFrequency.maxOf { it.value }
    }
}