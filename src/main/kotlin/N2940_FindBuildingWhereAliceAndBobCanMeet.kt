import java.util.PriorityQueue

class N2940_FindBuildingWhereAliceAndBobCanMeet {
    fun leftmostBuildingQueries(heights: IntArray, queries: Array<IntArray>): IntArray {
        val storeQueries = Array<ArrayList<IntArray>>(heights.size) { ArrayList() }
        val result = IntArray(queries.size) { -1 }
        queries.indices.forEach {
            val a = queries[it][0]
            val b = queries[it][1]
            if (a < b && heights[a] < heights[b]) {
                result[it] = b
            } else if (a > b && heights[a] > heights[b]) {
                result[it] = a
            } else if (a == b) {
                result[it] = a
            } else {
                storeQueries[maxOf(a, b)].add(intArrayOf(maxOf(heights[a], heights[b]), it))
            }
        }
        val maxIndex = PriorityQueue { a: IntArray, b: IntArray -> a[0] - b[0] }
        heights.indices.forEach {
            while (!maxIndex.isEmpty() && maxIndex.peek()[0] < heights[it]) result[maxIndex.poll()[1]] = it
            storeQueries[it].forEach { maxIndex.offer(it) }
        }
        return result
    }
}