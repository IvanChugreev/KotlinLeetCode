import java.util.LinkedList

class N3203_FindMinimumDiameterAfterMergingTwoTrees {
    fun minimumDiameterAfterMerge(edges1: Array<IntArray>, edges2: Array<IntArray>): Int {
        val n = edges1.size + 1
        val m = edges2.size + 1
        val adjList1 = buildAdjList(n, edges1)
        val adjList2 = buildAdjList(m, edges2)
        val diameter1 = findDiameter(adjList1)
        val diameter2 = findDiameter(adjList2)
        val combinedDiameter = (diameter1 shr 1) + (diameter1 and 1) + (diameter2 shr 1) + (diameter2 and 1) + 1
        return maxOf(diameter1, diameter2, combinedDiameter)
    }

    private fun buildAdjList(size: Int, edges: Array<IntArray>): Array<LinkedList<Int>> {
        val adjList = Array(size) { LinkedList<Int>() }
        edges.forEach {
            adjList[it[0]].add(it[1])
            adjList[it[1]].add(it[0])
        }
        return adjList
    }

    private fun findDiameter(adjList: Array<LinkedList<Int>>): Int {
        val leavesQueue = LinkedList<Int>()
        val degrees = IntArray(adjList.size)
        degrees.indices.forEach {
            degrees[it] = adjList[it].size
            if (degrees[it] == 1) leavesQueue.offer(it)
        }
        var remainingNodes = adjList.size
        var leavesLayersRemoved = 0
        while (remainingNodes > 2) {
            val size = leavesQueue.size
            remainingNodes -= size
            ++leavesLayersRemoved
            repeat(size) {
                val currentNode = leavesQueue.poll()
                adjList[currentNode].forEach {
                    --degrees[it]
                    if (degrees[it] == 1) leavesQueue.offer(it)
                }
            }
        }
        return (leavesLayersRemoved shl 1) + if (remainingNodes == 2) 1 else 0
    }
}