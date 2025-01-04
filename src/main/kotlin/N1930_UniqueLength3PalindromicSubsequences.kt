class N1930_UniqueLength3PalindromicSubsequences {
    fun countPalindromicSubsequence(s: String): Int {
        val last = IntArray(26)
        s.forEachIndexed { ind, symbol -> last[symbol - 'a'] = ind }
        var count = 0
        (0..s.length - 3).forEach { ind ->
            val curr = s[ind] - 'a'
            if (last[curr] != ind && last[curr] != ind + 1 && last[curr] != 0) {
                val between = BooleanArray(26)
                (ind + 1..<last[curr]).forEach {
                    val currCode = s[it] - 'a'
                    if (!between[currCode]) {
                        between[currCode] = true
                        ++count
                    }
                }
                last[curr] = 0
            }
        }
        return count
    }
}