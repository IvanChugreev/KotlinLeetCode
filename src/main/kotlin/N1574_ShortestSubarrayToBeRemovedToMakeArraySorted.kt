class N1574_ShortestSubarrayToBeRemovedToMakeArraySorted {
    fun findLengthOfShortestSubarray(arr: IntArray): Int {
        var right = (arr.lastIndex downTo 1).firstOrNull { arr[it] < arr[it - 1] } ?: 0
        var ans = right
        var left = 1
        if (right != 0) {
            while (right < arr.size && arr[0] > arr[right]) {
                ++right
            }
            ans = minOf(ans, right - 1)
        }
        while (left < right && arr[left - 1] <= arr[left]) {
            while (right < arr.size && arr[left] > arr[right]) {
                ++right
            }
            ans = minOf(ans, right - left - 1)
            ++left
        }
        return ans
    }
}