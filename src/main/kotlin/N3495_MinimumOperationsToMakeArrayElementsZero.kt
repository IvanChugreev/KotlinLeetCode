class N3495_MinimumOperationsToMakeArrayElementsZero {

    val expSum4 = longArrayOf(
        1L, 5L, 30L, 175L, 944L, 4785L, 23218L, 109235L, 502452L, 2271925L, 10136246L, 44739255L, 195734200L,
        850045625L, 3668617914L, 15748213435L, 67287820988L, 286331153085L
    )

    fun minOperations(queries: Array<IntArray>): Long =
        queries.sumOf { (expSum(it[1]) - expSum(it[0] - 1) + 1L) shr 1 }

    private fun expSum(n: Int): Long {
        if (n == 0) return 0
        val log4 = (31 - Integer.numberOfLeadingZeros(n)) shr 1
        val r = n - (1 shl (log4 shl 1))
        return expSum4[log4] + r * (log4 + 1L)
    }

}