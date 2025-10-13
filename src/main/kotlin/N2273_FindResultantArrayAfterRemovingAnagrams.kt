class N2273_FindResultantArrayAfterRemovingAnagrams {
    fun removeAnagrams(words: Array<String>): List<String> {
        val result = mutableListOf(words[0])
        var hash = hashAnagram(words[0])
        for (i in 1..<words.size) {
            val newHash = hashAnagram(words[i])
            if (!newHash.contentEquals(hash)) {
                result.add(words[i])
                hash = newHash
            }
        }
        return result
    }

    private fun hashAnagram(word: String): IntArray {
        val result = IntArray(4)
        for (c in word) {
            val idx = c - 'a'
            result[idx and 3] += 1 shl idx
        }
        return result
    }
}