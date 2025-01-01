class N1422_MaximumScoreAfterSplittingAString {
    fun maxScore(s: String): Int {
        var ones = 0
        var zeros = 0
        var best = Int.MIN_VALUE
        (0..<s.lastIndex).forEach {
            if (s[it] == '0') ++zeros else ++ones
            best = maxOf(best, zeros - ones)
        }
        if (s[s.lastIndex] == '1') ++ones
        return best + ones
    }
}