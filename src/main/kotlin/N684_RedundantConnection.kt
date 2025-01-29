class N684_RedundantConnection {
    fun findRedundantConnection(edges: Array<IntArray>): IntArray {
        val visited = BooleanArray(edges.size)
        val parent = IntArray(edges.size) { -1 }
        val adjList = Array(edges.size) { ArrayList<Int>() }
        var cycleStart = -1
        fun dfs(src: Int) {
            visited[src] = true
            adjList[src].forEach {
                if (!visited[it]) {
                    parent[it] = src
                    dfs(it)
                } else if (it != parent[src] && cycleStart == -1) {
                    cycleStart = it
                    parent[it] = src
                }
            }
        }
        edges.forEach {
            adjList[it[0] - 1].add(it[1] - 1)
            adjList[it[1] - 1].add(it[0] - 1)
        }
        dfs(0)
        val cycleNodes = HashMap<Int, Int>()
        var node = cycleStart
        do {
            cycleNodes[node] = 1
            node = parent[node]
        } while (node != cycleStart)
        edges.indices.reversed().forEach {
            if (cycleNodes.containsKey(edges[it][0] - 1) && cycleNodes.containsKey(edges[it][1] - 1)) return edges[it]
        }
        error("")
    }
}