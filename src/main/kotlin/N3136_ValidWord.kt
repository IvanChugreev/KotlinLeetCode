class N3136_ValidWord {

    private val vowels = setOf('a', 'e', 'i', 'o', 'u')

    fun isValid(word: String): Boolean {
        if (word.length < 3) return false
        var hasVowel = false
        var hasConsonant = false
        word.forEach {
            if (it >= 'a' && it <= 'z' || it >= 'A' && it <= 'Z') {
                val lowerSymbol = it.lowercaseChar()
                if (lowerSymbol in vowels) {
                    hasVowel = true
                } else {
                    hasConsonant = true
                }
            } else if (it < '0' || it > '9') {
                return false
            }
        }
        return hasVowel && hasConsonant
    }
}