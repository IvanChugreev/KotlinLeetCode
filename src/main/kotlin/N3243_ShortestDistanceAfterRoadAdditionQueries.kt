import java.util.LinkedList

class N3243_ShortestDistanceAfterRoadAdditionQueries {
    fun shortestDistanceAfterQueries(n: Int, queries: Array<IntArray>): IntArray {
        val nMinusOne = n - 1
        val ans = IntArray(queries.size)
        val adjList = Array<LinkedList<Int>>(nMinusOne) { LinkedList() }
        adjList.forEachIndexed { ind, list -> list.add(ind + 1) }
        val minDistance = IntArray(n) { nMinusOne - it }
        queries.forEachIndexed { ind, edge ->
            adjList[edge[0]].add(edge[1])
            (edge[0] downTo 0).forEach { currNode ->
                minDistance[currNode] = adjList[currNode].minOf { minDistance[it] + 1 }
            }
            ans[ind] = minDistance[0]
        }
        return ans
    }
}