class N2657_FindThePrefixCommonArrayOfTwoArrays {
    fun findThePrefixCommonArray(A: IntArray, B: IntArray): IntArray {
        val hasNumInA = BooleanArray(A.size + 1)
        val hasNumInB = BooleanArray(B.size + 1)
        var count = 0
        for (it in A.indices) {
            hasNumInA[A[it]] = true
            hasNumInB[B[it]] = true
            if (A[it] == B[it]) {
                ++count
            } else {
                if (hasNumInA[B[it]]) ++count
                if (hasNumInB[A[it]]) ++count
            }
            A[it] = count
        }
        return A
    }
}