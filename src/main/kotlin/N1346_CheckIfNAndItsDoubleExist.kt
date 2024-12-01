class N1346_CheckIfNAndItsDoubleExist {
    fun checkIfExist(arr: IntArray): Boolean {
        val prevNums = HashSet<Int>(arr.size * 4 / 3 + 2)
        arr.forEach {
            if (prevNums.contains(it shl 1) || it and 1 == 0 && prevNums.contains(it shr 1)) return true
            prevNums.add(it)
        }
        return false
    }
}