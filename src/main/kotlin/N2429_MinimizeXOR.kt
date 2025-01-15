class N2429_MinimizeXOR {
    fun minimizeXor(num1: Int, num2: Int): Int {
        var result = 0
        var bitsCount = num2.countOneBits()
        var currentBit = 31
        while (bitsCount > 0) {
            if ((num1 and (1 shl currentBit)) != 0 || bitsCount > currentBit) {
                result = result or (1 shl currentBit)
                --bitsCount
            }
            --currentBit
        }
        return result
    }
}