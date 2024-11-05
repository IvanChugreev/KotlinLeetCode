class N2914_MinimumNumberOfChangesToMakeBinaryStringBeautiful {
    fun minChanges(s: String): Int {
        return (s.indices step 2).count { s[it] != s[it + 1] }
    }
}