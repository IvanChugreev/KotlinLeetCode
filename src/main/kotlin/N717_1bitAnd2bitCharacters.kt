class N717_1bitAnd2bitCharacters {
    fun isOneBitCharacter(bits: IntArray): Boolean {
        var i = bits.size - 2
        while (i > -1 && bits[i] == 1) {
            --i
        }
        return (bits.size - i) and 1 == 0
    }
}