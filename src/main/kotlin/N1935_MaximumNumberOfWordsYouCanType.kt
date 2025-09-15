class N1935_MaximumNumberOfWordsYouCanType {
    fun canBeTypedWords(text: String, brokenLetters: String): Int {
        val brokenLetterArray = BooleanArray('z'.code + 1)
        for (letter in brokenLetters) {
            brokenLetterArray[letter.code] = true
        }
        var canWriteWord = true
        var canWriteWordCounter = 0
        for (char in text) {
            if (char == ' ') {
                if (canWriteWord) {
                    ++canWriteWordCounter
                } else {
                    canWriteWord = true
                }
            } else if (brokenLetterArray[char.code]) {
                canWriteWord = false
            }
        }
        if (canWriteWord) {
            ++canWriteWordCounter
        }
        return canWriteWordCounter
    }
}