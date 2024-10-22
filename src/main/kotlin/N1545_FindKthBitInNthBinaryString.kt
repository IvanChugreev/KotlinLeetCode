class N1545_FindKthBitInNthBinaryString {
    fun findKthBit(n: Int, k: Int): Char {
        return if ((((k shr (Integer.numberOfTrailingZeros(k) + 1)) and 1) == 1) xor ((k and 1) == 1)) '0' else '1'
    }
}