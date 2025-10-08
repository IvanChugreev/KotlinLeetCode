class N2300_SuccessfulPairsOfSpellsAndPotions {
    fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {
        potions.sort()
        val max = potions.last()
        for (i in spells.indices) {
            val div = success / spells[i]
            if (div > max) {
                spells[i] = 0
                continue
            }
            spells[i] = potions.size - potions.leftBinarySearch(div.toInt() + if (success % spells[i] > 0) 1 else 0)
        }
        return spells
    }

    private fun IntArray.leftBinarySearch(element: Int): Int {
        var left = 0
        var right = size
        while (left < right) {
            val mid = (left + right) ushr 1
            if (this[mid] < element) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return left
    }
}