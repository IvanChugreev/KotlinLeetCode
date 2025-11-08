class N1611_MinimumOneBitOperationsToMakeIntegersZero {
    fun minimumOneBitOperations(n: Int): Int {
        var x = n
        x = x xor (x ushr 16)
        x = x xor (x ushr 8)
        x = x xor (x ushr 4)
        x = x xor (x ushr 2)
        x = x xor (x ushr 1)
        return x
    }
}