import java.util.LinkedList

class N2290_MinimumObstacleRemovalToReachCorner {
    data class Pos(val row: Int, val col: Int)

    fun minimumObstacles(grid: Array<IntArray>): Int {
        val endPos = Pos(grid.size - 1, grid[0].size - 1)
        var currQuery = LinkedList<Pos>()
        var nextQuery = LinkedList<Pos>()
        val visited = HashSet<Pos>(grid.size * grid[0].size * 4 / 3 + 2)
        var cnt = -1
        currQuery.offer(Pos(0, 0))
        visited.add(currQuery.peek())
        fun addPos(newPos: Pos) {
            if (!visited.contains(newPos)) {
                if (grid[newPos.row][newPos.col] == 0) currQuery.offer(newPos) else nextQuery.offer(newPos)
                visited.add(newPos)
            }
        }
        while (!visited.contains(endPos)) {
            while (currQuery.isNotEmpty()) {
                val currPos = currQuery.poll()
                if (currPos.row - 1 >= 0) addPos(Pos(currPos.row - 1, currPos.col))
                if (currPos.col - 1 >= 0) addPos(Pos(currPos.row, currPos.col - 1))
                if (currPos.row + 1 < grid.size) addPos(Pos(currPos.row + 1, currPos.col))
                if (currPos.col + 1 < grid[0].size) addPos(Pos(currPos.row, currPos.col + 1))
            }
            ++cnt
            currQuery = nextQuery.also { nextQuery = currQuery }
        }
        return cnt
    }
}