class N1930_UniqueLength3PalindromicSubsequences {
    fun countPalindromicSubsequence(s: String): Int {
        val first = IntArray(26) { -1 }
        val last = IntArray(26) { -1 }
        for (i in s.indices) {
            val charIndex = s[i] - 'a'
            if (first[charIndex] == -1) {
                first[charIndex] = i
            }
            last[charIndex] = i
        }
        var res = 0
        for (i in 0..25) {
            val firstIndex = first[i]
            val lastIndex = last[i]
            if (firstIndex == -1 || lastIndex - firstIndex < 2) continue
            val uniqueChars = BooleanArray(26)
            for (j in firstIndex + 1 until lastIndex) {
                val charIndex = s[j] - 'a'
                if (!uniqueChars[charIndex]) {
                    uniqueChars[charIndex] = true
                    ++res
                }
            }
        }
        return res
    }
}