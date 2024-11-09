class N3133_MinimumArrayEnd {
    fun minEnd(n: Int, x: Int): Long {
        var newN = n - 1
        val newX = x.toLong()
        var result = newX
        var mask = 1L
        while (newN > 0) {
            if (mask and newX == 0L) {
                if (newN and 1 == 1) result = result or mask
                newN = newN shr 1
            }
            mask = mask shl 1
        }
        return result
    }
}