import java.util.LinkedList

class N773_SlidingPuzzle {
    fun slidingPuzzle(board: Array<IntArray>): Int {
        val directions = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(0, 2, 4),
            intArrayOf(1, 5),
            intArrayOf(0, 4),
            intArrayOf(1, 3, 5),
            intArrayOf(2, 4)
        )
        val target = "123450"
        val startState = StringBuilder()
        board.forEach { row -> row.forEach { startState.append(it) } }
        val visited = HashSet<String>()
        val queue = LinkedList<String>()
        val start = startState.toString()
        queue.add(start)
        visited.add(start)
        var moves = 0
        while (!queue.isEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val currentState = queue.poll()
                if (currentState == target) return moves
                val zeroPos = currentState.indexOf('0')
                directions[zeroPos].forEach {
                    val nextState = StringBuilder(currentState)
                    nextState.setCharAt(zeroPos, currentState[it])
                    nextState.setCharAt(it, currentState[zeroPos])
                    val next = nextState.toString()
                    if (next !in visited) {
                        visited.add(next)
                        queue.add(next)
                    }
                }
            }
            ++moves
        }
        return -1
    }
}