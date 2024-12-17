class N2182_ConstructStringWithRepeatLimit {
    fun repeatLimitedString(s: String, repeatLimit: Int): String {
        val charCount = IntArray(26)
        s.forEach { ++charCount[it - 'a'] }
        val result = StringBuilder()
        var ind = 25
        while (ind > -1) {
            if (charCount[ind] != 0) {
                val currInd = ind
                var min = minOf(charCount[currInd], repeatLimit)
                charCount[currInd] -= min
                val maxString = ('a' + currInd).toString().repeat(min)
                result.append(maxString)
                if (charCount[currInd] != 0) {
                    var div = charCount[currInd] / repeatLimit
                    val rem = charCount[currInd] % repeatLimit
                    --ind
                    while (div != 0) {
                        while (ind > -1 && charCount[ind] == 0) --ind
                        if (ind > -1) {
                            min = minOf(charCount[ind], div)
                            div -= min
                            charCount[ind] -= min
                            val newString = 'a' + ind + maxString
                            repeat(min) { result.append(newString) }
                        } else break
                    }
                    if (rem != 0) {
                        while (ind > -1 && charCount[ind] == 0) --ind
                        if (ind > -1) {
                            --charCount[ind]
                            result.append('a' + ind + maxString.substring(0, rem))
                        }
                    }
                    charCount[currInd] = 0
                    continue
                }
            }
            --ind
        }
        return result.toString()
    }
}