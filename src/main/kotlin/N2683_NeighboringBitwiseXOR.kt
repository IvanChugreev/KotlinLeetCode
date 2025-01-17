class N2683_NeighboringBitwiseXOR {
    fun doesValidArrayExist(derived: IntArray): Boolean = derived.reduce { acc, num -> acc xor num } == 0
}