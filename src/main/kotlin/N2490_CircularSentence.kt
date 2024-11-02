class N2490_CircularSentence {
    fun isCircularSentence(sentence: String): Boolean {
        return sentence.first() == sentence.last() &&
                (1..<sentence.lastIndex).none { sentence[it] == ' ' && sentence[it - 1] != sentence[it + 1] }
    }
}