class N2684_MaximumNumberOfMovesInAGrid {
    fun maxMoves(grid: Array<IntArray>): Int {
        var currStep = BooleanArray(grid.size)
        var prevStep = BooleanArray(grid.size) { true }
        val gridLastIndex = grid.lastIndex
        for (i in 1..<grid[0].size) {
            val prevI = i - 1
            if (prevStep[0]) {
                if (grid[0][prevI] < grid[0][i]) currStep[0] = true
                if (grid[0][prevI] < grid[1][i]) currStep[1] = true
            }
            for (j in 1..<gridLastIndex) {
                if (prevStep[j]) {
                    if (grid[j][prevI] < grid[j - 1][i]) currStep[j - 1] = true
                    if (grid[j][prevI] < grid[j][i]) currStep[j] = true
                    if (grid[j][prevI] < grid[j + 1][i]) currStep[j + 1] = true
                }
            }
            if (prevStep[gridLastIndex]) {
                if (grid[gridLastIndex][prevI] < grid[gridLastIndex - 1][i]) currStep[gridLastIndex - 1] = true
                if (grid[gridLastIndex][prevI] < grid[gridLastIndex][i]) currStep[gridLastIndex] = true
            }
            prevStep.fill(false)
            if (!currStep.any { it }) return prevI
            prevStep = currStep.also { currStep = prevStep }
        }
        return grid[0].lastIndex
    }
}