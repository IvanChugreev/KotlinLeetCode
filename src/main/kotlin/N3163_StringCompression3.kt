class N3163_StringCompression3 {
    fun compressedString(word: String): String {
        val comp = StringBuilder()
        var cnt = 1
        var lastChar = word[0]
        (1..word.lastIndex).forEach {
            if (word[it] == lastChar && cnt < 9) {
                ++cnt
            } else {
                comp.append(cnt).append(lastChar)
                cnt = 1
                lastChar = word[it]
            }
        }
        return comp.append(cnt).append(lastChar).toString()
    }
}