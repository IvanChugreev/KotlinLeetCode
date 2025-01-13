class N3223_MinimumLengthOfStringAfterOperations {
    fun minimumLength(s: String): Int {
        val chars = IntArray(26)
        s.forEach { ++chars[it - 'a'] }
        return chars.sumOf { if (it > 2) 2 - (it and 1) else it }
    }
}