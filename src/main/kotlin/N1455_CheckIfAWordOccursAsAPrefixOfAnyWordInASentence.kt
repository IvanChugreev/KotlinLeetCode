class N1455_CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    fun isPrefixOfWord(sentence: String, searchWord: String): Int {
        var wordCnt = 1
        var i = -1
        var j = 0
        while (++i < sentence.length) {
            if (sentence[i] == searchWord[j]) {
                if (++j >= searchWord.length) return wordCnt
            } else {
                j = 0
                ++wordCnt
                while (i < sentence.length && sentence[i] != ' ') ++i
            }
        }
        return -1
    }
}