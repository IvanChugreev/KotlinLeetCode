class N916_WordSubsets {
    fun wordSubsets(words1: Array<String>, words2: Array<String>): List<String> {
        val indices = (0..25)
        val charArr1 = IntArray(26)
        val charArr2 = IntArray(26)
        words2.forEach { word ->
            word.forEach { ++charArr1[it - 'a'] }
            indices.forEach {
                if (charArr2[it] < charArr1[it]) charArr2[it] = charArr1[it]
                charArr1[it] = 0
            }
        }
        val result = ArrayList<String>()
        words1.forEach { word ->
            word.forEach { ++charArr1[it - 'a'] }
            if (indices.all { charArr2[it] <= charArr1[it] }) result.add(word)
            charArr1.fill(0)
        }
        return result
    }
}