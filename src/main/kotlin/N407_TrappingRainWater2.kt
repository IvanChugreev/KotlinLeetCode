import utils.PriorityQueueWithBulkInitBuilder

class N407_TrappingRainWater2 {

    private data class Cell(var height: Int, var row: Int, var col: Int)

    private val dirs = arrayOf(intArrayOf(0, 1), intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(-1, 0))

    fun trapRainWater(heightMap: Array<IntArray>): Int {
        val n = heightMap.size
        val m = heightMap[0].size
        if (n == 1 || m == 1) return 0
        val nMinusOne = n - 1
        val mMinusOne = m - 1
        val visited = Array(n) { BooleanArray(m) }
        val pqInitData = ArrayList<Cell>((nMinusOne shl 1) + (mMinusOne shl 1))
        for (i in 0..nMinusOne) {
            pqInitData += Cell(heightMap[i][0], i, 0)
            pqInitData += Cell(heightMap[i][mMinusOne], i, mMinusOne)
            visited[i][0] = true
            visited[i][mMinusOne] = true
        }
        for (i in 1..<mMinusOne) {
            pqInitData += Cell(heightMap[0][i], 0, i)
            pqInitData += Cell(heightMap[nMinusOne][i], nMinusOne, i)
            visited[0][i] = true
            visited[nMinusOne][i] = true
        }
        val boundary = PriorityQueueWithBulkInitBuilder
            .buildPriorityQueueWithBulkInit(pqInitData, compareBy { it.height })
        var totalWaterVolume = 0
        while (boundary.isNotEmpty()) {
            val currentCell = boundary.poll()
            for (dir in dirs) {
                val neighborRow = currentCell.row + dir[0]
                val neighborCol = currentCell.col + dir[1]
                if (
                    neighborRow > -1 && neighborCol > -1 && neighborRow < n && neighborCol < m
                    && !visited[neighborRow][neighborCol]
                ) {
                    val neighborHeight = heightMap[neighborRow][neighborCol]
                    if (neighborHeight < currentCell.height) {
                        totalWaterVolume += currentCell.height - neighborHeight
                    }
                    boundary.add(Cell(maxOf(neighborHeight, currentCell.height), neighborRow, neighborCol))
                    visited[neighborRow][neighborCol] = true
                }
            }
        }
        return totalWaterVolume
    }
}