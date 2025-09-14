class N966_VowelSpellchecker {

    fun spellchecker(wordlist: Array<String>, queries: Array<String>): Array<String> {
        val wordSet = wordlist.toSet()
        val lowercaseWordMap = HashMap<String, String>()
        val lowercaseDeVowelWordMap = HashMap<String, String>()
        for (word in wordlist) {
            val lowercaseWord = word.lowercase()
            lowercaseWordMap.putIfAbsent(lowercaseWord, word)
            lowercaseDeVowelWordMap.putIfAbsent(lowercaseWord.removeVowels(), word)
        }
        for (index in queries.indices) {
            if (queries[index] !in wordSet) {
                val lowercaseWord = queries[index].lowercase()
                if (lowercaseWord in lowercaseWordMap) {
                    queries[index] = lowercaseWordMap[lowercaseWord]!!
                } else {
                    val lowercaseDeVowelWord = lowercaseWord.removeVowels()
                    if (lowercaseDeVowelWord in lowercaseDeVowelWordMap) {
                        queries[index] = lowercaseDeVowelWordMap[lowercaseDeVowelWord]!!
                    } else {
                        queries[index] = ""
                    }
                }
            }
        }
        return queries
    }

    private fun Char.isVowel(): Boolean = this == 'a' || this == 'e' || this == 'i' || this == 'o' || this == 'u'

    private fun String.removeVowels(): String {
        val stringBuilder = StringBuilder()
        forEach { stringBuilder.append(if (it.isVowel()) '_' else it) }
        return stringBuilder.toString()
    }

}