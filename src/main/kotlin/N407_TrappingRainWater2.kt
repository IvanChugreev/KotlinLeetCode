import java.util.PriorityQueue

class N407_TrappingRainWater2 {

    private class Cell(var height: Int, var row: Int, var col: Int) : Comparable<Cell?> {
        override fun compareTo(other: Cell?) = this.height.compareTo(other!!.height)
    }

    private val dirs = arrayOf(intArrayOf(0, 1), intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(-1, 0))

    fun trapRainWater(heightMap: Array<IntArray>): Int {
        val visited = Array(heightMap.size) { BooleanArray(heightMap[0].size) }
        val boundary = PriorityQueue<Cell>()
        heightMap.indices.forEach {
            boundary.offer(Cell(heightMap[it][0], it, 0))
            boundary.offer(Cell(heightMap[it][heightMap[0].size - 1], it, heightMap[0].size - 1))
            visited[it][0] = true
            visited[it][heightMap[0].size - 1] = true
        }
        heightMap[0].indices.forEach {
            boundary.offer(Cell(heightMap[0][it], 0, it))
            boundary.offer(Cell(heightMap[heightMap.size - 1][it], heightMap.size - 1, it))
            visited[0][it] = true
            visited[heightMap.size - 1][it] = true
        }
        var totalWaterVolume = 0
        while (boundary.isNotEmpty()) {
            val currentCell = boundary.poll()
            dirs.forEach {
                val neighborRow = currentCell.row + it[0]
                val neighborCol = currentCell.col + it[1]
                if (
                    neighborRow >= 0 && neighborCol >= 0 && neighborRow < heightMap.size
                    && neighborCol < heightMap[0].size && !visited[neighborRow][neighborCol]
                ) {
                    val neighborHeight = heightMap[neighborRow][neighborCol]
                    if (neighborHeight < currentCell.height) totalWaterVolume += currentCell.height - neighborHeight
                    boundary.offer(Cell(maxOf(neighborHeight, currentCell.height), neighborRow, neighborCol))
                    visited[neighborRow][neighborCol] = true
                }
            }
        }
        return totalWaterVolume
    }
}