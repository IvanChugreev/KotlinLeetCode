class N2017_GridGame {
    fun gridGame(grid: Array<IntArray>): Long {
        var firstRowSum = grid[0].sumOf { it.toLong() }
        var secondRowSum = 0L
        var minimumSum = Long.MAX_VALUE
        grid[0].indices.forEach {
            firstRowSum -= grid[0][it]
            minimumSum = minOf(minimumSum, maxOf(firstRowSum, secondRowSum))
            secondRowSum += grid[1][it]
        }
        return minimumSum
    }
}