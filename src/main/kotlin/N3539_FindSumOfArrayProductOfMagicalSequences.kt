class N3539_FindSumOfArrayProductOfMagicalSequences {

    private val mod = 1_000_000_007L

    fun magicalSum(m: Int, k: Int, nums: IntArray): Int {
        val n = nums.size
        val mm = m shl 1
        val nextM = m + 1
        val fac = LongArray(nextM)
        fac[0] = 1L
        for (i in 1..m) {
            fac[i] = (fac[i - 1] * i) % mod
        }
        val ifac = LongArray(nextM)
        ifac[0] = 1L
        ifac[1] = 1L
        for (i in 2..m) {
            ifac[i] = quickMul(i.toLong(), mod - 2)
        }
        for (i in 2..m) {
            ifac[i] = (ifac[i - 1] * ifac[i]) % mod
        }
        val numsPower = Array(n) { LongArray(nextM) }
        for (i in 0 until n) {
            numsPower[i][0] = 1L
            for (j in 1..m) {
                numsPower[i][j] = (numsPower[i][j - 1] * nums[i]) % mod
            }
        }
        val f = Array(n) { Array(nextM) { Array(mm + 1) { LongArray(k + 1) } } }
        for (j in 0..m) {
            f[0][j][j][0] = (numsPower[0][j] * ifac[j]) % mod
        }
        for (i in 0 until n - 1) {
            for (j in 0..m) {
                for (p in 0..mm) {
                    for (q in 0..k) {
                        val q2 = (p and 1) + q
                        if (q2 > k) break
                        for (r in 0..(m - j)) {
                            val p2 = (p shr 1) + r
                            val add = (((f[i][j][p][q] * numsPower[i + 1][r]) % mod) * ifac[r]) % mod
                            f[i + 1][j + r][p2][q2] = (f[i + 1][j + r][p2][q2] + add) % mod
                        }
                    }
                }
            }
        }
        var res = 0L
        for (p in 0..mm) {
            for (q in 0..k) {
                if (Integer.bitCount(p) + q == k) {
                    res = (res + ((f[n - 1][m][p][q] * fac[m]) % mod)) % mod
                }
            }
        }
        return res.toInt()
    }

    private fun quickMul(x: Long, y: Long): Long {
        var res = 1L
        var cur = x % mod
        var exp = y
        while (exp > 0) {
            if ((exp and 1L) == 1L) {
                res = (res * cur) % mod
            }
            exp = exp shr 1
            cur = (cur * cur) % mod
        }
        return res
    }

}