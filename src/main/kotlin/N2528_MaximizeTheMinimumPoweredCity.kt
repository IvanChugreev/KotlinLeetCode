class N2528_MaximizeTheMinimumPoweredCity {
    fun maxPower(stations: IntArray, r: Int, k: Int): Long {
        val powers = calcPowers(stations, r)
        val minPower = powers.min()
        if (stations.size <= 1 + (r shl 1)) {
            return minPower + k
        }
        var left = minPower + 1
        var right = minPower + k
        while (left <= right) {
            val mid = left + ((right - left) shr 1)
            if (canAchieveMinPower(powers, r, k, mid)) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return right
    }

    private fun calcPowers(stations: IntArray, r: Int): LongArray {
        val n = stations.size
        val result = LongArray(n)
        var power = (0..<r).fold(0L) { acc, i -> acc + stations[i] }
        for (i in stations.indices) {
            if (r < i) {
                power -= stations[i - r - 1]
            }
            if (i + r < n) {
                power += stations[i + r]
            }
            result[i] = power
        }
        return result
    }

    private fun canAchieveMinPower(powers: LongArray, r: Int, k: Int, targetMin: Long): Boolean {
        val n = powers.size
        val dPowers = LongArray(n)
        var remainingK = k.toLong()
        for ((i, power) in powers.withIndex()) {
            if (i > 0) {
                dPowers[i] += dPowers[i - 1]
            }
            val shortage = maxOf(0, targetMin - power - dPowers[i])
            if (remainingK < shortage) {
                return false
            }
            remainingK -= shortage
            dPowers[i] += shortage
            val end = i + (r shl 1) + 1
            if (end < n) {
                dPowers[end] -= shortage
            }
        }
        return true
    }
}