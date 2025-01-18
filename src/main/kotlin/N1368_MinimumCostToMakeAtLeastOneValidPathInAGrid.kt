import java.util.LinkedList

class N1368_MinimumCostToMakeAtLeastOneValidPathInAGrid {
    private val dirs = arrayOf(intArrayOf(0, 1), intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(-1, 0))

    fun minCost(grid: Array<IntArray>): Int {
        var cost = 0
        val minCost = Array(grid.size) { IntArray(grid[0].size) { Int.MAX_VALUE } }
        val queue = LinkedList<IntArray>()
        fun dfs(row: Int, col: Int) {
            if (row < 0 || col < 0 || row >= minCost.size || col >= minCost[0].size || minCost[row][col] != Int.MAX_VALUE) return
            minCost[row][col] = cost
            queue.offer(intArrayOf(row, col))
            val nextDir = grid[row][col] - 1
            dfs(row + dirs[nextDir][0], col + dirs[nextDir][1])
        }
        dfs(0, 0)
        while (!queue.isEmpty()) {
            ++cost
            var levelSize = queue.size
            while (levelSize-- > 0) {
                val curr = queue.poll()
                dirs.forEach { dfs(curr[0] + it[0], curr[1] + it[1]) }
            }
        }
        return minCost[grid.size - 1][grid[0].size - 1]
    }
}