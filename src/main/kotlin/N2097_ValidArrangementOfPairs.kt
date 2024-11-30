import java.util.LinkedList
import java.util.Stack

class N2097_ValidArrangementOfPairs {
    fun validArrangement(pairs: Array<IntArray>): Array<IntArray> {
        val adjacencyMatrix = HashMap<Int, LinkedList<Int>>()
        val inDegree = HashMap<Int, Int>()
        val outDegree = HashMap<Int, Int>()
        pairs.forEach { pair ->
            adjacencyMatrix.putIfAbsent(pair[0], LinkedList())
            adjacencyMatrix[pair[0]]!!.add(pair[1])
            outDegree[pair[0]] = outDegree.getOrDefault(pair[0], 0) + 1
            inDegree[pair[1]] = inDegree.getOrDefault(pair[1], 0) + 1
        }
        val result = ArrayList<Int>()
        var startNode = -1
        for (entry in outDegree) {
            if (entry.value == inDegree.getOrDefault(entry.key, 0) + 1) {
                startNode = entry.key
                break
            }
        }
        if (startNode == -1) startNode = pairs[0][0]
        val nodeStack = Stack<Int>()
        nodeStack.push(startNode)
        while (nodeStack.isNotEmpty()) {
            val node = nodeStack.peek()
            if (adjacencyMatrix.getOrDefault(node, LinkedList<Int>()).size > 0) {
                val nextNode = adjacencyMatrix[node]!!.removeFirst()
                nodeStack.push(nextNode)
            } else {
                result.add(node)
                nodeStack.pop()
            }
        }
        result.reverse()
        val pairedResult = Array(result.lastIndex) { IntArray(2) }
        (1..<result.size).forEach {
            pairedResult[it - 1][0] = result[it - 1]
            pairedResult[it - 1][1] = result[it]
        }
        return pairedResult
    }
}