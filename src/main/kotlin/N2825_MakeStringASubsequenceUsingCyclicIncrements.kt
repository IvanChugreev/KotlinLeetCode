class N2825_MakeStringASubsequenceUsingCyclicIncrements {
    fun canMakeSubsequence(str1: String, str2: String): Boolean {
        var ind = 0
        str2.forEach {
            val prevChar = if (it == 'a') 'z' else it - 1
            while (ind < str1.length && str1[ind] != prevChar && str1[ind] != it) ++ind
            if (ind++ >= str1.length) return false
        }
        return true
    }
}