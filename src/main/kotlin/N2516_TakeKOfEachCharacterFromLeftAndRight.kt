class N2516_TakeKOfEachCharacterFromLeftAndRight {
    fun takeCharacters(s: String, k: Int): Int {
        val count = IntArray(3)
        s.forEach { ++count[it - 'a'] }
        if (count.any { it < k }) return -1
        val window = IntArray(3)
        var left = 0
        var maxWindow = 0
        s.indices.forEach { right ->
            ++window[s[right] - 'a']
            while (left <= right && (count[0] - window[0] < k || count[1] - window[1] < k || count[2] - window[2] < k)) {
                --window[s[left] - 'a']
                ++left
            }
            maxWindow = maxOf(maxWindow, right - left + 1)
        }
        return s.length - maxWindow
    }
}