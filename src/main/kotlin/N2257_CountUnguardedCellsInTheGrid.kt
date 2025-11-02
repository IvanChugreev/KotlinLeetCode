class N2257_CountUnguardedCellsInTheGrid {
    fun countUnguarded(m: Int, n: Int, guards: Array<IntArray>, walls: Array<IntArray>): Int {
        val grid = Array(m) { IntArray(n) }
        for ((y, x) in walls) {
            grid[y][x] = 2
        }
        for ((y, x) in guards) {
            grid[y][x] = 3
        }
        for ((y, x) in guards) {
            var i = y + 1
            while (i < m && grid[i][x] < 2) {
                grid[i++][x] = 1
            }
            i = y - 1
            while (i >= 0 && grid[i][x] < 2) {
                grid[i--][x] = 1
            }
            i = x + 1
            while (i < n && grid[y][i] < 2) {
                grid[y][i++] = 1
            }
            i = x - 1
            while (i >= 0 && grid[y][i] < 2) {
                grid[y][i--] = 1
            }
        }
        var result = 0
        for (row in grid) {
            for (value in row) {
                if (value < 1) {
                    ++result
                }
            }
        }
        return result
    }
}