import java.util.LinkedList

class N2872_MaximumNumberOfKDivisibleComponents {
    fun maxKDivisibleComponents(n: Int, edges: Array<IntArray>, values: IntArray, k: Int): Int {
        if (n == 1) return 1
        val adjacencyList = Array<LinkedList<Int>>(n) { LinkedList() }
        val inDegree = IntArray(n)
        edges.forEach {
            adjacencyList[it[0]].add(it[1])
            adjacencyList[it[1]].add(it[0])
            ++inDegree[it[0]]
            ++inDegree[it[1]]
        }
        val longValues = LongArray(n)
        values.forEachIndexed { ind, value -> longValues[ind] = value.toLong() }
        var componentCount = 0
        val queue = LinkedList<Int>()
        inDegree.forEachIndexed { ind, degree -> if(degree == 1) queue.offer(ind) }
        while (queue.isNotEmpty()) {
            val currentNode = queue.poll()
            --inDegree[currentNode]
            var addValue = 0L
            if (longValues[currentNode] % k == 0L) ++componentCount else addValue = longValues[currentNode]
            adjacencyList[currentNode].forEach {
                if (inDegree[it] != 0) {
                    --inDegree[it]
                    longValues[it] += addValue
                    if (inDegree[it] == 1) queue.offer(it)
                }
            }
        }
        return componentCount
    }
}