import java.util.LinkedList

class N1408_StringMatchingInAnArray {
    class TrieNode(var frequency: Int = 0, var childNodes: HashMap<Char, TrieNode> = HashMap()) {
        fun insertSubstring(str: String, startIndex: Int, endIndex: Int) {
            var currentNode = this
            (startIndex..endIndex).forEach {
                currentNode.childNodes.putIfAbsent(str[it], TrieNode())
                currentNode = currentNode.childNodes[str[it]]!!
                ++currentNode.frequency
            }
        }

        fun isSubstring(str: String): Boolean {
            var currentNode = this
            str.forEach { currentNode = currentNode.childNodes[it]!! }
            return currentNode.frequency > 1
        }
    }

    fun stringMatching(words: Array<String>): List<String> {
        val root = TrieNode()
        words.forEach { word ->
            val endInd = word.lastIndex
            word.indices.forEach { root.insertSubstring(word, it, endInd) }
        }
        val matchingWords = LinkedList<String>()
        words.forEach { if (root.isSubstring(it)) matchingWords.add(it) }
        return matchingWords
    }
}