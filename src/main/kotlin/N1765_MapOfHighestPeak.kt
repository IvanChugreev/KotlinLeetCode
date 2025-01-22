import java.util.LinkedList

class N1765_MapOfHighestPeak {

    private val dirs = arrayOf(intArrayOf(0, 1), intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(-1, 0))

    fun highestPeak(isWater: Array<IntArray>): Array<IntArray> {
        val cellQueue = LinkedList<IntArray>()
        isWater.indices.forEach { x ->
            isWater[0].indices.forEach { y ->
                if (isWater[x][y] == 1) cellQueue.add(intArrayOf(x, y))
                --isWater[x][y]
            }
        }
        var heightOfNextLayer = 1
        while (cellQueue.isNotEmpty()) {
            val layerSize = cellQueue.size
            repeat(layerSize) {
                val currentCell = cellQueue.poll()
                dirs.forEach {
                    val x = currentCell[0] + it[0]
                    val y = currentCell[1] + it[1]
                    if (x >= 0 && y >= 0 && x < isWater.size && y < isWater[0].size && isWater[x][y] == -1) {
                        isWater[x][y] = heightOfNextLayer
                        cellQueue.add(intArrayOf(x, y))
                    }
                }
            }
            ++heightOfNextLayer
        }
        return isWater
    }
}