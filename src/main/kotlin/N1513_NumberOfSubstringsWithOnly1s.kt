class N1513_NumberOfSubstringsWithOnly1s {
    fun numSub(s: String): Int {
        var ones = 0
        var result = 0L
        for (symbol in s) {
            if (symbol == '1') {
                ++ones
            } else if (ones != 0) {
                result += (ones.toLong() * (ones + 1)) shr 1
                ones = 0
            }
        }
        return ((result + ((ones.toLong() * (ones + 1)) shr 1)) % 1_000_000_007).toInt()
    }
}