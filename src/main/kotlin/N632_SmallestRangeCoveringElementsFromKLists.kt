import java.util.PriorityQueue

class N632_SmallestRangeCoveringElementsFromKLists {
    fun smallestRange(nums: List<List<Int>>): IntArray {
        val pq = PriorityQueue(Comparator.comparingInt<IntArray> { it[0] })
        var maxVal = Int.MIN_VALUE
        val range = intArrayOf(0, Int.MAX_VALUE)
        for (i in nums.indices) {
            pq.offer(intArrayOf(nums[i][0], i, 0))
            maxVal = maxOf(maxVal, nums[i][0])
        }
        while (pq.size == nums.size) {
            val data = pq.poll()
            val minVal = data[0]
            val row = data[1]
            val col = data[2]
            if (maxVal - minVal < range[1] - range[0]) {
                range[0] = minVal
                range[1] = maxVal
            }
            if (col + 1 < nums[row].size) {
                val nextVal = nums[row][col + 1]
                pq.offer(intArrayOf(nextVal, row, col + 1))
                maxVal = maxOf(maxVal, nextVal)
            }
        }
        return range
    }
}