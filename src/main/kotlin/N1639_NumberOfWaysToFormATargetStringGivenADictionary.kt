class N1639_NumberOfWaysToFormATargetStringGivenADictionary {
    fun numWays(words: Array<String>, target: String): Int {
        val mod = 1000000007
        val charFrequency = Array(words[0].length) { IntArray(26) }
        words.forEach { word -> word.indices.forEach { ++charFrequency[it][word[it] - 'a'] } }
        val prevCount = IntArray(target.length + 1)
        val currCount = IntArray(target.length + 1)
        prevCount[0] = 1
        currCount[0] = 1
        (1..words[0].length).forEach { currWord ->
            (1..target.length).forEach {
                currCount[it] = ((currCount[it] + charFrequency[currWord - 1][target[it - 1] - 'a'].toLong() *
                        prevCount[it - 1]) % mod).toInt()
            }
            currCount.copyInto(prevCount)
        }
        return prevCount[target.length]
    }
}