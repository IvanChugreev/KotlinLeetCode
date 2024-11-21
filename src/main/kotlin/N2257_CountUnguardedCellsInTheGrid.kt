class N2257_CountUnguardedCellsInTheGrid {
    enum class TypeCell {
        UNGUARDED,
        GUARDED_HORIZONTAL,
        GUARDED_VERTICAL,
        GUARDED_BOTH,
        WALL
    }

    fun countUnguarded(m: Int, n: Int, guards: Array<IntArray>, walls: Array<IntArray>): Int {
        val grid = Array(m) { Array(n) { TypeCell.UNGUARDED } }
        fun updateCells(row: Int, col: Int) {
            if (grid[row][col] == TypeCell.GUARDED_BOTH) return
            var ind: Int
            if (grid[row][col] != TypeCell.GUARDED_HORIZONTAL) {
                ind = col
                while (--ind > -1 && grid[row][ind] != TypeCell.WALL) {
                    if (grid[row][ind] == TypeCell.GUARDED_VERTICAL) {
                        grid[row][ind] = TypeCell.GUARDED_BOTH
                    } else {
                        grid[row][ind] = TypeCell.GUARDED_HORIZONTAL
                    }
                }
                ind = col
                while (++ind < n && grid[row][ind] != TypeCell.WALL) {
                    if (grid[row][ind] == TypeCell.GUARDED_VERTICAL) {
                        grid[row][ind] = TypeCell.GUARDED_BOTH
                    } else {
                        grid[row][ind] = TypeCell.GUARDED_HORIZONTAL
                    }
                }
            }
            if (grid[row][col] != TypeCell.GUARDED_VERTICAL) {
                ind = row
                while (--ind > -1 && grid[ind][col] != TypeCell.WALL) {
                    if (grid[ind][col] == TypeCell.GUARDED_HORIZONTAL) {
                        grid[ind][col] = TypeCell.GUARDED_BOTH
                    } else {
                        grid[ind][col] = TypeCell.GUARDED_VERTICAL
                    }
                }
                ind = row
                while (++ind < m && grid[ind][col] != TypeCell.WALL) {
                    if (grid[ind][col] == TypeCell.GUARDED_HORIZONTAL) {
                        grid[ind][col] = TypeCell.GUARDED_BOTH
                    } else {
                        grid[ind][col] = TypeCell.GUARDED_VERTICAL
                    }
                }
            }
            grid[row][col] = TypeCell.GUARDED_BOTH
        }
        walls.forEach { grid[it[0]][it[1]] = TypeCell.WALL }
        guards.forEach { updateCells(it[0], it[1]) }
        return grid.sumOf { it.count { cell -> cell == TypeCell.UNGUARDED } }
    }
}