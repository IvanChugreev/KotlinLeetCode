class N1405_LongestHappyString {
    fun longestDiverseString(a: Int, b: Int, c: Int): String {
        val ans = StringBuilder()
        val cntA = Pair(a, 'a')
        val cntB = Pair(b, 'b')
        val cntC = Pair(c, 'c')
        val comparator = compareBy<Pair> { it.first }
        while (true) {
            val maxCnt = maxOf(cntA, cntB, cntC, comparator)
            if (maxCnt.first > 1) {
                ans.append(maxCnt.second).append(maxCnt.second)
                maxCnt.first -= 2
            } else if (maxCnt.first == 1){
                ans.append(maxCnt.second)
                maxCnt.first = 0
            } else {
                return ans.toString()
            }
            val secondMaxCnt = when (maxCnt.second) {
                'a' -> maxOf(cntB, cntC, comparator)
                'b' -> maxOf(cntA, cntC, comparator)
                'c' -> maxOf(cntA, cntB, comparator)
                else -> error("")
            }
            if (secondMaxCnt.first >= maxCnt.first) {
                if (secondMaxCnt.first > 1) {
                    ans.append(secondMaxCnt.second).append(secondMaxCnt.second)
                    secondMaxCnt.first -= 2
                } else if (secondMaxCnt.first == 1){
                    ans.append(secondMaxCnt.second)
                    secondMaxCnt.first = 0
                } else {
                    return ans.toString()
                }
            } else if (secondMaxCnt.first != 0) {
                ans.append(secondMaxCnt.second)
                --secondMaxCnt.first
            } else {
                return ans.toString()
            }
        }
    }

    private data class Pair(var first: Int, val second: Char)
}