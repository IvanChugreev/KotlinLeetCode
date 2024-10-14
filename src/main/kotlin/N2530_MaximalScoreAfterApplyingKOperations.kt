import java.util.PriorityQueue
import java.util.Collections

class N2530_MaximalScoreAfterApplyingKOperations {
    fun maxKelements(nums: IntArray, k: Int): Long {
        val pq = MaxHeapFactory.createMaxHeap(nums)
        var sum = 0L
        for (i in k downTo 1) {
            val maxElement = pq.poll()
            if (maxElement == 1) {
                sum += i
                break
            }
            sum += maxElement
            pq.add((maxElement + 2) / 3)
        }
        return sum
    }

    private class MaxHeapFactory(
        private val wrapped: IntArray
    ) : PriorityQueue<Int>(Collections.reverseOrder()) {
        companion object {
            fun createMaxHeap(wrapped: IntArray): PriorityQueue<Int> {
                return PriorityQueue(MaxHeapFactory(wrapped))
            }
        }

        override fun toArray(): Array<Any> {
            return Array(wrapped.size) { wrapped[it] }
        }
    }
}