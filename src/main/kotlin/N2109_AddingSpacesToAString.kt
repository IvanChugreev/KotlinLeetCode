class N2109_AddingSpacesToAString {
    fun addSpaces(s: String, spaces: IntArray): String {
        val ans = StringBuilder()
        var ind = 0
        spaces.forEach {
            while (ind < it) ans.append(s[ind++])
            ans.append(' ')
        }
        while (ind < s.length) ans.append(s[ind++])
        return ans.toString()
    }
}