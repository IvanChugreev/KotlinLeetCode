class N2064_MinimizedMaximumOfProductsDistributedToAnyStore {
    fun minimizedMaximum(n: Int, quantities: IntArray): Int {
        fun canDistribute(x: Int): Boolean {
            var j = 0
            var remaining = quantities[j]
            repeat(n) { if (remaining <= x) if (++j == quantities.size) return true else remaining = quantities[j] else remaining -= x }
            return false
        }
        var left = 0
        var right = quantities.max()
        while (left < right) {
            val middle = (left + right) shr 1
            if (canDistribute(middle)) right = middle else left = middle + 1
        }
        return left
    }
}