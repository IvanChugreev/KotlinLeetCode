import java.util.PriorityQueue

class N2577_MinimumTimeToVisitACellInAGrid {
    fun minimumTime(grid: Array<IntArray>): Int {
        if (grid[0][1] > 1 && grid[1][0] > 1) return -1
        val visited = Array(grid.size) { BooleanArray(grid[0].size) }
        val query = PriorityQueue(Comparator.comparingInt<IntArray> { it[0] })
        query.add(intArrayOf(0, 0, 0))
        fun addToQuery(value: IntArray) {
            val needTime = grid[value[1]][value[2]]
            if (value[0] < needTime) value[0] = if (needTime and 1 == value[0] and 1) needTime else needTime + 1
            query.add(value)
        }

        val lastRow = grid.size - 1
        val lastCol = grid[0].size - 1
        while (query.isNotEmpty()) {
            val curr = query.poll()
            val time = curr[0]
            val row = curr[1]
            val col = curr[2]
            if (row == lastRow && col == lastCol) return time
            if (visited[row][col]) continue
            visited[row][col] = true
            if (row >= 1) addToQuery(intArrayOf(time + 1, row - 1, col))
            if (col >= 1) addToQuery(intArrayOf(time + 1, row, col - 1))
            if (row < lastRow) addToQuery(intArrayOf(time + 1, row + 1, col))
            if (col < lastCol) addToQuery(intArrayOf(time + 1, row, col + 1))
        }
        error("Error")
    }
}