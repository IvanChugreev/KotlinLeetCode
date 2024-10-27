class N1233_RemoveSubFoldersFromTheFileSystem {
    data class TrieNode(
        var isEndOfFolder: Boolean = false,
        var children: HashMap<String, TrieNode> = HashMap()
    )

    fun removeSubfolders(folder: Array<String>): List<String> {
        val root = TrieNode()
        for (path in folder) {
            var currentNode: TrieNode? = root
            val folderNames = path.split('/')
            for (folderName in folderNames) {
                if (folderName == "") continue
                if (!currentNode!!.children.containsKey(folderName)) {
                    currentNode.children[folderName] = TrieNode()
                }
                currentNode = currentNode.children[folderName]
            }
            currentNode!!.isEndOfFolder = true
        }
        val result = ArrayList<String>()
        for (path in folder) {
            var currentNode: TrieNode? = root
            val folderNames = path.split('/')
            var isSubfolder = false
            for (i in folderNames.indices) {
                if (folderNames[i] == "") continue
                val nextNode = currentNode!!.children[folderNames[i]]
                if (nextNode!!.isEndOfFolder && i != folderNames.size - 1) {
                    isSubfolder = true
                    break
                }
                currentNode = nextNode
            }
            if (!isSubfolder) result.add(path)
        }
        return result
    }
}