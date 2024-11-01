class N1957_DeleteCharactersToMakeFancyString {
    fun makeFancyString(s: String): String {
        var prevChar = ' '
        var cnt = 0
        val ans = StringBuilder()
        s.forEach {
            if (it == prevChar) {
                if (cnt < 2) {
                    ++cnt
                    ans.append(it)
                }
            } else {
                cnt = 1
                prevChar = it
                ans.append(it)
            }
        }
        return ans.toString()
    }
}