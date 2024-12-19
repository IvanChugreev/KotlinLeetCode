class N769_MaxChunksToMakeSorted {
    fun maxChunksToSorted(arr: IntArray): Int {
        var max = 0
        var cnt = 0
        arr.forEachIndexed { ind, num ->
            if (max < num) max = num
            if (max == ind) ++cnt
        }
        return cnt
    }
}