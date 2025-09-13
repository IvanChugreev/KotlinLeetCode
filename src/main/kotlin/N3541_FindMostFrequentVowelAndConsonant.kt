class N3541_FindMostFrequentVowelAndConsonant {
    fun maxFreqSum(s: String): Int {
        val letterFrequencies = IntArray(26)
        s.forEach { ++letterFrequencies[it - 'a'] }
        var maxFreqVowels = 0
        var maxFreqConsonants = 0
        letterFrequencies.forEachIndexed { index, freq ->
            if (index == 0 || index == 4 || index == 8 || index == 14 || index == 20) {
                if (maxFreqVowels < freq) {
                    maxFreqVowels = freq
                }
            } else {
                if (maxFreqConsonants < freq) {
                    maxFreqConsonants = freq
                }
            }
        }
        return maxFreqVowels + maxFreqConsonants
    }
}