import utils.UnionFind

class N778_SwimInRisingWater {

    fun swimInWater(grid: Array<IntArray>): Int {
        val nn = grid.size * grid.size
        val lastIndex = grid.lastIndex
        val heightToPosition = IntArray(nn)
        for (i in 0..lastIndex) for (j in 0..lastIndex) {
            heightToPosition[grid[i][j]] = i shl 12 or j
        }
        val unionFind = UnionFind(nn)
        var currentHeight = 0
        while (unionFind.find(grid[lastIndex][lastIndex]) != unionFind.find(grid[0][0])) {
            ++currentHeight
            val row = heightToPosition[currentHeight] shr 12
            val col = heightToPosition[currentHeight] and 0xFFF

            if (col > 0 && grid[row][col - 1] <= currentHeight) {
                unionFind.union(grid[row][col], grid[row][col - 1])
            }
            if (col < lastIndex && grid[row][col + 1] <= currentHeight) {
                unionFind.union(grid[row][col], grid[row][col + 1])
            }
            if (row > 0 && grid[row - 1][col] <= currentHeight) {
                unionFind.union(grid[row][col], grid[row - 1][col])
            }
            if (row < lastIndex && grid[row + 1][col] <= currentHeight) {
                unionFind.union(grid[row][col], grid[row + 1][col])
            }
        }
        return currentHeight
    }
}