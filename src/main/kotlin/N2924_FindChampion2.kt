class N2924_FindChampion2 {
    fun findChampion(n: Int, edges: Array<IntArray>): Int {
        val checkRootArray = BooleanArray(n) { true }
        edges.forEach { checkRootArray[it[1]] = false }
        var champ = -1
        checkRootArray.forEachIndexed { ind, isRoot -> if (isRoot) if (champ == -1) champ = ind else return -1 }
        return champ
    }
}