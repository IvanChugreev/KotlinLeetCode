class N417_PacificAtlanticWaterFlow {

    private val directions = arrayOf(intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))

    fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
        val m = heights.size
        val n = heights[0].size
        val pacific = Array(m) { BooleanArray(n) }
        val atlantic = Array(m) { BooleanArray(n) }
        val pacificQueue: ArrayDeque<Pair<Int, Int>> = ArrayDeque()
        val atlanticQueue: ArrayDeque<Pair<Int, Int>> = ArrayDeque()
        for (i in 0 until m) {
            pacificQueue.add(i to 0)
            pacific[i][0] = true
            atlanticQueue.add(i to n - 1)
            atlantic[i][n - 1] = true
        }
        for (j in 0 until n) {
            pacificQueue.add(0 to j)
            pacific[0][j] = true
            atlanticQueue.add(m - 1 to j)
            atlantic[m - 1][j] = true
        }
        bfs(heights, pacificQueue, pacific)
        bfs(heights, atlanticQueue, atlantic)
        val result = mutableListOf<List<Int>>()
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(listOf(i, j))
                }
            }
        }
        return result
    }

    private fun bfs(heights: Array<IntArray>, queue: ArrayDeque<Pair<Int, Int>>, visited: Array<BooleanArray>) {
        val m = heights.size
        val n = heights[0].size
        while (queue.isNotEmpty()) {
            val (x, y) = queue.removeFirst()
            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy
                if (nx !in 0 until m || ny !in 0 until n) continue
                if (visited[nx][ny]) continue
                if (heights[nx][ny] < heights[x][y]) continue
                visited[nx][ny] = true
                queue.add(nx to ny)
            }
        }
    }
}