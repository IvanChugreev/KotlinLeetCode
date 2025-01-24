class N802_FindEventualSafeStates {
    fun eventualSafeNodes(graph: Array<IntArray>): List<Int> {
        val visit = BooleanArray(graph.size)
        val inStack = BooleanArray(graph.size)
        fun dfs(node: Int): Boolean {
            if (inStack[node]) return true
            if (visit[node]) return false
            visit[node] = true
            inStack[node] = true
            graph[node].forEach { if (dfs(it)) return true }
            inStack[node] = false
            return false
        }
        graph.indices.forEach { dfs(it) }
        return graph.indices.filter { !inStack[it] }
    }
}