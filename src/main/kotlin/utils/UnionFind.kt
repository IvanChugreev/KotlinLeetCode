package utils

class UnionFind(n: Int) {
    private val parent = IntArray(n) { it }
    private val rank = IntArray(n)

    fun find(x: Int): Int {
        var root = x
        while (parent[root] != root) {
            root = parent[root]
        }
        var currParent = x
        while (parent[currParent] != currParent) {
            parent[currParent] = root.also { currParent = parent[currParent] }
        }
        return root
    }

    fun union(x: Int, y: Int) {
        val xRoot = find(x)
        val yRoot = find(y)
        if (xRoot == yRoot) return
        when {
            rank[xRoot] < rank[yRoot] -> parent[xRoot] = yRoot
            rank[xRoot] > rank[yRoot] -> parent[yRoot] = xRoot
            else -> parent[yRoot] = xRoot.also { ++rank[xRoot] }
        }
    }
}