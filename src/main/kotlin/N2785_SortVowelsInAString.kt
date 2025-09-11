class N2785_SortVowelsInAString {

    private val vowels = "AEIOUaeiou"

    private val vowelsMap = mapOf(
        'A' to 0, 'E' to 1, 'I' to 2, 'O' to 3, 'U' to 4, 'a' to 5, 'e' to 6, 'i' to 7, 'o' to 8, 'u' to 9
    )

    fun sortVowels(s: String): String {
        val vowelCounters = IntArray(10)
        s.forEach {
            if (it in vowelsMap) {
                ++vowelCounters[vowelsMap[it]!!]
            }
        }
        var cntInd = 0
        val result = StringBuilder()
        s.forEach {
            if (it in vowelsMap) {
                while (vowelCounters[cntInd] == 0) {
                    ++cntInd
                }
                result.append(vowels[cntInd])
                --vowelCounters[cntInd]
            } else {
                result.append(it)
            }
        }
        return result.toString()
    }
}