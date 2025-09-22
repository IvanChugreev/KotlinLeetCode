class N3005_CountElementsWithMaximumFrequency {
    fun maxFrequencyElements(nums: IntArray): Int {
        val frequency = IntArray(101) { 0 }
        var max = 0
        var count = 0
        for (num in nums) {
            ++frequency[num]
            if (max < frequency[num]) {
                max = frequency[num]
                count = max
            } else if (max == frequency[num]) {
                count += max
            }
        }
        return count
    }
}