import java.util.PriorityQueue
import java.util.TreeSet

class N1942_TheNumberOfTheSmallestUnoccupiedChair {
    fun smallestChair(times: Array<IntArray>, targetFriend: Int): Int {
        val targetArrival = times[targetFriend][0]
        times.sortBy { it[0] }
        var nextChair = 0
        val leavingQueue = PriorityQueue { a: IntArray, b: IntArray -> a[0] - b[0] }
        val availableChairs = TreeSet<Int>()
        for (time in times) {
            val arrival = time[0]
            val leave = time[1]
            while (!leavingQueue.isEmpty() && leavingQueue.peek()[0] <= arrival) {
                availableChairs.add(leavingQueue.poll()[1])
            }
            var currentChair: Int
            if (!availableChairs.isEmpty()) {
                currentChair = availableChairs.first()
                availableChairs.remove(currentChair)
            } else {
                currentChair = nextChair++
            }
            leavingQueue.offer(intArrayOf(leave, currentChair))
            if (arrival == targetArrival) return currentChair
        }
        return 0
    }
}