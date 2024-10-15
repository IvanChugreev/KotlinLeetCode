class N2938_SeparateBlackAndWhiteBalls {
    fun minimumSteps(s: String): Long {
        var whiteCounter = 0
        var ans = 0L
        for (i in s.lastIndex downTo 0) {
            if (s[i] == '0') ++whiteCounter else ans += whiteCounter
        }
        return ans
    }
}