class N1267_CountServersThatCommunicate {
    fun countServers(grid: Array<IntArray>): Int {
        var communicableServersCount = 0
        val rowCounts = IntArray(grid[0].size)
        val lastServerInCol = IntArray(grid.size) { -1 }
        grid.indices.forEach { row ->
            var serverCountInRow = 0
            grid[0].indices.forEach { col ->
                if (grid[row][col] == 1) {
                    ++serverCountInRow
                    ++rowCounts[col]
                    lastServerInCol[row] = col
                }
            }
            if (serverCountInRow != 1) {
                communicableServersCount += serverCountInRow
                lastServerInCol[row] = -1
            }
        }
        return communicableServersCount +
                grid.indices.count { lastServerInCol[it] != -1 && rowCounts[lastServerInCol[it]] > 1 }
    }
}