class N3186_MaximumTotalDamageWithSpellCasting {
    fun maximumTotalDamage(power: IntArray): Long {
        val sorted = IntArray(power.size + 1)
        power.copyInto(sorted)
        sorted[power.size] = Int.MAX_VALUE
        sorted.sort()
        val dp = LongArray(4)
        val dpPower = IntArray(4) { -3 }
        var dpIndex = 4
        var currentFreq = 1L
        for (i in 0 until sorted.lastIndex) {
            if (sorted[i] == sorted[i + 1]) {
                ++currentFreq
                continue
            }
            var j = dpIndex - 1
            while (dpPower[j and 3] + 2 >= sorted[i]) {
                --j
            }
            dp[dpIndex and 3] = maxOf(dp[(dpIndex - 1) and 3], currentFreq * sorted[i] + dp[j and 3])
            dpPower[dpIndex and 3] = sorted[i]
            ++dpIndex
            currentFreq = 1L
        }
        return dp[(dpIndex - 1) and 3]
    }
}