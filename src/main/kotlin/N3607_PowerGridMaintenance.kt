import utils.UnionFind
import java.util.LinkedList

class N3607_PowerGridMaintenance {
    fun processQueries(c: Int, connections: Array<IntArray>, queries: Array<IntArray>): IntArray {
        val c1 = c + 1
        val isOffline = BooleanArray(c1)
        val unionFind = UnionFind(c1)
        for (connection in connections) {
            unionFind.union(connection[0], connection[1])
        }
        val components = HashMap<Int, LinkedList<Int>>()
        for (node in 1..c) {
            components.computeIfAbsent(unionFind.find(node)) { LinkedList() }.add(node)
        }
        val result = ArrayList<Int>()
        for (queries in queries) {
            if (queries[0] == 2) {
                isOffline[queries[1]] = true
            } else if (isOffline[queries[1]]) {
                val currComponent = components[unionFind.find(queries[1])]!!
                while (currComponent.isNotEmpty() && isOffline[currComponent.peek()]) {
                    currComponent.poll()
                }
                result.add(if (currComponent.isEmpty()) -1 else currComponent.peek())
            } else {
                result.add(queries[1])
            }
        }
        return result.toIntArray()
    }
}