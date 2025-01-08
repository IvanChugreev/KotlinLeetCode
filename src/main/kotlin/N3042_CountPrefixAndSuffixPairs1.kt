class N3042_CountPrefixAndSuffixPairs1 {
    fun countPrefixSuffixPairs(words: Array<String>): Int {
        val lastInd = words.lastIndex
        var count = 0
        words.indices.forEach { i ->
            count += (i + 1..lastInd).count { j ->
                words[i] <= words[j] && words[j].startsWith(words[i]) && words[j].endsWith(words[i])
            }
        }
        return count
    }
}