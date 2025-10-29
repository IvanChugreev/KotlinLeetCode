class N3370_SmallestNumberWithAllSetBits {
    fun smallestNumber(n: Int): Int = (n.takeHighestOneBit() shl 1) - 1
}