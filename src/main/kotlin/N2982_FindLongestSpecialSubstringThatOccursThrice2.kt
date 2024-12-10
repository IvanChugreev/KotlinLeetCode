class N2982_FindLongestSpecialSubstringThatOccursThrice2 {
    fun maximumLength(s: String): Int {
        val substringLengths = Array(26) { IntArray(3) }
        var ind = 0
        while (ind < s.length) {
            val startInd = ind
            val currentChar = s[ind++]
            while (ind < s.length && currentChar == s[ind]) ++ind
            val length = ind - startInd
            val numberOfChar = currentChar - 'a'
            if (substringLengths[numberOfChar][2] < length) {
                if (substringLengths[numberOfChar][1] < length) {
                    if (substringLengths[numberOfChar][0] < length) {
                        substringLengths[numberOfChar][2] = substringLengths[numberOfChar][1]
                        substringLengths[numberOfChar][1] = substringLengths[numberOfChar][0]
                        substringLengths[numberOfChar][0] = length
                    } else {
                        substringLengths[numberOfChar][2] = substringLengths[numberOfChar][1]
                        substringLengths[numberOfChar][1] = length
                    }
                } else {
                    substringLengths[numberOfChar][2] = length
                }
            }
        }
        var maxLength = 0
        substringLengths.forEach {
            if (it[0] == it[1]) {
                if (it[0] == it[2]) {
                    if (maxLength < it[0]) maxLength = it[0]
                } else {
                    if (maxLength < it[0] - 1) maxLength = it[0] - 1
                }
            } else if (it[0] == it[1] + 1) {
                if (maxLength < it[1]) maxLength = it[1]
            } else {
                if (maxLength < it[0] - 2) maxLength = it[0] - 2
            }
        }
        return if (maxLength == 0) -1 else maxLength
    }
}