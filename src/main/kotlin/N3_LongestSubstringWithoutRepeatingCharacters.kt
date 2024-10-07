class N3_LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        val uniqueSymbols = mutableSetOf<Char>()
        var maxLength = 0
        s.forEachIndexed { index, char ->
            if (uniqueSymbols.contains(char)) {
                if (uniqueSymbols.size > maxLength) maxLength = uniqueSymbols.size
                for (i in index-uniqueSymbols.size..<index) {
                    if (s[i] == char) break else uniqueSymbols.remove(s[i])
                }
            } else {
                uniqueSymbols.add(char)
            }
        }
        return if (uniqueSymbols.size > maxLength) uniqueSymbols.size else maxLength
    }
}