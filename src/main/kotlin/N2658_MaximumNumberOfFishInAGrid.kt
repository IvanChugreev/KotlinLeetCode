import java.util.LinkedList

class N2658_MaximumNumberOfFishInAGrid {
    private val dirs = arrayOf(intArrayOf(0, 1), intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(-1, 0))
    fun findMaxFish(grid: Array<IntArray>): Int {
        val visited = Array(grid.size) { BooleanArray(grid[0].size) }
        val query = LinkedList<IntArray>()
        fun countFishes(row: Int, col: Int): Int {
            var fishCount = 0
            query.add(intArrayOf(row, col))
            visited[row][col] = true
            while (!query.isEmpty()) {
                val cell = query.poll()
                val currRow = cell[0]
                val currCol = cell[1]
                fishCount += grid[currRow][currCol]
                dirs.forEach {
                    val newRow = currRow + it[0]
                    val newCol = currCol + it[1]
                    if (0 <= newRow && newRow < grid.size && 0 <= newCol && newCol < grid[0].size
                        && grid[newRow][newCol] != 0 && !visited[newRow][newCol]
                    ) {
                        query.add(intArrayOf(newRow, newCol))
                        visited[newRow][newCol] = true
                    }
                }
            }
            return fishCount
        }

        var result = 0
        grid.indices.forEach { i ->
            grid[0].indices.forEach { j ->
                if (grid[i][j] != 0 && !visited[i][j]) result = maxOf(result, countFishes(i, j))
            }
        }
        return result
    }
}