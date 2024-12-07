class N1760_MinimumLimitOfBallsInABag {
    fun minimumSize(nums: IntArray, maxOperations: Int): Int {
        fun isPossible(maxBallsInBag: Int): Boolean {
            var totalOperations = 0
            nums.forEach {
                var operations = it / maxBallsInBag
                if (it % maxBallsInBag == 0) --operations
                totalOperations += operations
                if (totalOperations > maxOperations) return false
            }
            return true
        }

        var left = 1
        var right = nums.max()
        while (left < right) {
            val middle = (left + right) shr 1
            if (isPossible(middle)) right = middle else left = middle + 1
        }
        return left
    }
}