class N5_LongestPalindromicSubstring {
    fun preprocessString(s: String): String {
        val sb = StringBuilder()
        sb.append('#')
        for (ch in s) {
            sb.append(ch)
            sb.append('#')
        }
        return sb.toString()
    }

    fun longestPalindrome(s: String): String {
        val processedString = preprocessString(s)
        val n = processedString.length
        val P = IntArray(n)
        var C = 0
        var R = 0
        var maxLen = 0
        var centerIndex = 0
        for (i in 0 until n) {
            val mirror = 2 * C - i
            if (i < R) {
                P[i] = Math.min(R - i, P[mirror])
            }
            var a = i + P[i] + 1
            var b = i - P[i] - 1
            while (a < n && b >= 0 && processedString[a] == processedString[b]) {
                P[i]++
                a++
                b--
            }
            if (i + P[i] > R) {
                C = i
                R = i + P[i]
            }
            if (P[i] > maxLen) {
                maxLen = P[i]
                centerIndex = i
            }
        }
        val start = (centerIndex - maxLen) / 2
        return s.substring(start, start + maxLen)
    }
}