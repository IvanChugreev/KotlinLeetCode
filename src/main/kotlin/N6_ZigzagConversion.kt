class N6_ZigzagConversion {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) return s
        val n = s.length
        val cycleLen = 2 * numRows - 2
        val result = StringBuilder()
        for (row in 0..<numRows) {
            var i = row
            while (i < n) {
                result.append(s[i])
                val nextInZigzag = i + cycleLen - 2 * row
                if (row != 0 && row != numRows - 1 && nextInZigzag < n) {
                    result.append(s[nextInZigzag])
                }
                i += cycleLen
            }
        }
        return result.toString()
    }
}