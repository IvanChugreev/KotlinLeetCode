class N3228_MaximumNumberOfOperationsToMoveOnesToTheEnd {
    fun maxOperations(s: String): Int {
        var result = 0
        var last = '0'
        var ones = 0
        for (symbol in s) {
            when {
                symbol == '1' -> ++ones
                last == '1' -> result += ones
            }
            last = symbol
        }
        return result
    }
}