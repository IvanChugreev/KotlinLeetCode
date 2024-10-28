class N2501_LongestSquareStreakInAnArray {
    fun longestSquareStreak(nums: IntArray): Int {
        val uniqueNumbers = nums.toSet()
        var lengthStreak = sequenceOf(2, 4, 16, 256, 65536).takeWhile { uniqueNumbers.contains(it) }.count()
        if (lengthStreak > 3) return lengthStreak
        lengthStreak = maxOf(
            lengthStreak,
            sequenceOf(3, 9, 81, 6561).takeWhile { uniqueNumbers.contains(it) }.count(),
            sequenceOf(4, 16, 256, 65536).takeWhile { uniqueNumbers.contains(it) }.count()
        )
        if (lengthStreak > 2) return lengthStreak
        val streaksOf3 = sequence {
            yield(sequenceOf(5, 25, 625))
            yield(sequenceOf(6, 36, 1296))
            yield(sequenceOf(7, 49, 2401))
            yield(sequenceOf(8, 64, 4096))
            yield(sequenceOf(9, 81, 6561))
            yield(sequenceOf(10, 100, 10000))
            yield(sequenceOf(11, 121, 14641))
            yield(sequenceOf(12, 144, 20736))
            yield(sequenceOf(13, 169, 28561))
            yield(sequenceOf(14, 196, 38416))
            yield(sequenceOf(15, 225, 50625))
            yield(sequenceOf(16, 256, 65536))
            yield(sequenceOf(17, 289, 83521))
        }
        streaksOf3.forEach { streak ->
            val currLength = streak.takeWhile { uniqueNumbers.contains(it) }.count()
            if (currLength > lengthStreak) if (currLength == 3) return 3 else lengthStreak = currLength
        }
        return if (lengthStreak == 2 || (18..316).any { uniqueNumbers.contains(it) && uniqueNumbers.contains(it * it) }) 2 else -1
    }
}