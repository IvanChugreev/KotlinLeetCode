class N1671_MinimumNumberOfRemovalsToMakeMountainArray {
    fun minimumMountainRemovals(nums: IntArray): Int {
        val sequence = ArrayList<Int>()
        fun binSearch(target: Int): Int {
            var left = 0
            var right = sequence.lastIndex
            while (left <= right) {
                val mid = (right + left) shr 1
                if (sequence[mid] >= target) right = mid - 1 else left = mid + 1
            }
            return left
        }

        val lisLen = IntArray(nums.size)
        lisLen[0] = 1
        sequence.add(nums[0])
        for (i in 1..<nums.size) {
            if (sequence.last() < nums[i]) sequence.add(nums[i]) else sequence[binSearch(nums[i])] = nums[i]
            lisLen[i] = sequence.size
        }
        sequence.clear()
        val ldsLen = IntArray(nums.size)
        ldsLen[nums.lastIndex] = 1
        sequence.add(nums.last())
        for (i in nums.size - 2 downTo 0) {
            if (sequence.last() < nums[i]) sequence.add(nums[i]) else sequence[binSearch(nums[i])] = nums[i]
            ldsLen[i] = sequence.size
        }
        return nums.size + 1 - (1..<nums.size).filter { lisLen[it] != 1 && ldsLen[it] != 1 }
            .maxOf { lisLen[it] + ldsLen[it] }
    }
}