class N2554_MaximumNumberOfIntegersToChooseFromARange {
    fun maxCount(banned: IntArray, n: Int, maxSum: Int): Int {
        val bannedSet = banned.toSet()
        var cnt = 0
        var sum = 0
        (1..n).forEach {
            if (it !in bannedSet) {
                sum += it
                if (sum <= maxSum) ++cnt else return cnt
            }
        }
        return cnt
    }
}