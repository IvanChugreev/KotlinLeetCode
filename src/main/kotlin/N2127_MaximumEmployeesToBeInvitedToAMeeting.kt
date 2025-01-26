import java.util.LinkedList

class N2127_MaximumEmployeesToBeInvitedToAMeeting {
    fun maximumInvitations(favorite: IntArray): Int {
        val inDegree = IntArray(favorite.size)
        favorite.forEach { ++inDegree[it] }
        val queue = LinkedList<Int>()
        inDegree.indices.forEach { if (inDegree[it] == 0) queue.offer(it) }
        val depth = IntArray(favorite.size) { 1 }
        while (queue.isNotEmpty()) {
            val currentNode = queue.poll()
            val nextNode = favorite[currentNode]
            depth[nextNode] = maxOf(depth[nextNode], depth[currentNode] + 1)
            if (--inDegree[nextNode] == 0) queue.offer(nextNode)
        }
        var longestCycle = 0
        var twoCycleInvitations = 0
        inDegree.indices.forEach {
            if (inDegree[it] != 0) {
                var cycleLength = 0
                var current = it
                while (inDegree[current] != 0) {
                    inDegree[current] = 0
                    ++cycleLength
                    current = favorite[current]
                }
                if (cycleLength == 2) {
                    twoCycleInvitations += depth[it] + depth[favorite[it]]
                } else {
                    longestCycle = maxOf(longestCycle, cycleLength)
                }
            }
        }
        return maxOf(longestCycle, twoCycleInvitations)
    }
}