class N1304_FindNUniqueIntegersSumUpToZero {
    fun sumZero(n: Int): IntArray {
        val res = IntArray(n)
        for (i in n shr 1 downTo 1) {
            res[i - 1] = i
            res[n - i] = -i
        }
        return res
    }
}