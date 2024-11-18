class N1652_DefuseTheBomb {
    fun decrypt(code: IntArray, k: Int): IntArray {
        val result = IntArray(code.size)
        if (k == 0) return result
        var start = 1
        var end = k
        if (k < 0) {
            start = code.size + k
            end = code.size - 1
        }
        var sum = (start..end).sumOf { code[it] }
        code.indices.forEach {
            result[it] = sum
            if (start >= code.size) start -= code.size
            if (++end >= code.size) end -= code.size
            sum -= code[start++]
            sum += code[end]
        }
        return result
    }
}