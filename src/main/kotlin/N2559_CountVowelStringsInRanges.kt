class N2559_CountVowelStringsInRanges {
    fun vowelStrings(words: Array<String>, queries: Array<IntArray>): IntArray {
        val vowels = BooleanArray(123)
        vowels[97] = true
        vowels[101] = true
        vowels[105] = true
        vowels[111] = true
        vowels[117] = true
        val prefSum = IntArray(words.size + 1)
        words.forEachIndexed { ind, word ->
            prefSum[ind + 1] = prefSum[ind] + if (vowels[word[0].code] && vowels[word[word.lastIndex].code]) 1 else 0
        }
        val result = IntArray(queries.size)
        queries.forEachIndexed { ind, query -> result[ind] = prefSum[query[1] + 1] - prefSum[query[0]] }
        return result
    }
}