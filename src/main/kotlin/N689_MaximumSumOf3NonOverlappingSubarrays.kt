class N689_MaximumSumOf3NonOverlappingSubarrays {
    fun maxSumOfThreeSubarrays(nums: IntArray, k: Int): IntArray {
        val size = nums.size - k
        val doubleK = k shl 1
        var bestSingleStart = 0
        val bestDoubleStart = intArrayOf(0, k)
        val bestTripleStart = intArrayOf(0, k, doubleK)
        var currWindowSumSingle = 0
        var currWindowSumDouble = 0
        var currWindowSumTriple = 0
        (0..<k).forEach { currWindowSumSingle += nums[it] }
        (k..<doubleK).forEach { currWindowSumDouble += nums[it] }
        (doubleK..<doubleK + k).forEach { currWindowSumTriple += nums[it] }
        var bestSingleSum = currWindowSumSingle
        var bestDoubleSum = bestSingleSum + currWindowSumDouble
        var bestTripleSum = bestDoubleSum + currWindowSumTriple
        var singleStartInd = 1
        var doubleStartInd = k + 1
        var tripleStartInd = doubleK + 1
        while (tripleStartInd <= size) {
            currWindowSumSingle = currWindowSumSingle - nums[singleStartInd - 1] + nums[singleStartInd + k - 1]
            currWindowSumDouble = currWindowSumDouble - nums[doubleStartInd - 1] + nums[doubleStartInd + k - 1]
            currWindowSumTriple = currWindowSumTriple - nums[tripleStartInd - 1] + nums[tripleStartInd + k - 1]
            if (currWindowSumSingle > bestSingleSum) {
                bestSingleStart = singleStartInd
                bestSingleSum = currWindowSumSingle
            }
            if (currWindowSumDouble + bestSingleSum > bestDoubleSum) {
                bestDoubleStart[0] = bestSingleStart
                bestDoubleStart[1] = doubleStartInd
                bestDoubleSum = currWindowSumDouble + bestSingleSum
            }
            if (currWindowSumTriple + bestDoubleSum > bestTripleSum) {
                bestTripleStart[0] = bestDoubleStart[0]
                bestTripleStart[1] = bestDoubleStart[1]
                bestTripleStart[2] = tripleStartInd
                bestTripleSum = currWindowSumTriple + bestDoubleSum
            }
            ++singleStartInd
            ++doubleStartInd
            ++tripleStartInd
        }
        return bestTripleStart
    }
}