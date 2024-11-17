import java.util.LinkedList

class N862_ShortestSubarrayWithSumAtLeastK {
    fun shortestSubarray(nums: IntArray, targetSum: Int): Int {
        val prefixSums = nums.runningFold(0L) { sum, element -> sum + element }
        val candidateIndices = LinkedList<Int>()
        var shortestSubarrayLength = Int.MAX_VALUE
        candidateIndices.offer(0)
        (1..nums.size).forEach {
            while (candidateIndices.isNotEmpty() && prefixSums[it] - prefixSums[candidateIndices.peekFirst()] >= targetSum) {
                shortestSubarrayLength = minOf(shortestSubarrayLength, it - candidateIndices.pollFirst())
            }
            while (candidateIndices.isNotEmpty() && prefixSums[it] <= prefixSums[candidateIndices.peekLast()]) {
                candidateIndices.pollLast()
            }
            candidateIndices.offerLast(it)
        }
        return if (shortestSubarrayLength == Int.MAX_VALUE) -1 else shortestSubarrayLength
    }
}