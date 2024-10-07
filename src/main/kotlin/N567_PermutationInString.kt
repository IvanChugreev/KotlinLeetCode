class N567_PermutationInString {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val s1Counts = IntArray(26)
        val s2Counts = IntArray(26)
        s1.forEach { ++s1Counts[it - 'a'] }
        var currentSubstringSize = 0
        s2.forEachIndexed { index, char ->
            val symbol = char - 'a'
            if (s1Counts[symbol] == 0) {
                if (currentSubstringSize != 0) {
                    currentSubstringSize = 0
                    s2Counts.fill(0)
                }
            } else if (s1Counts[symbol] == s2Counts[symbol]) {
                for (i in (index - currentSubstringSize)..<index) {
                    if (s2[i] == char) {
                        currentSubstringSize = index - i
                        break
                    } else {
                        --s2Counts[s2[i] - 'a']
                    }
                }
            } else {
                ++s2Counts[symbol]
                if (++currentSubstringSize == s1.length) return true
            }
        }
        return false
    }
}