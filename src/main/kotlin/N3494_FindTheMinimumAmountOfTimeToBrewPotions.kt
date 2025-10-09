class N3494_FindTheMinimumAmountOfTimeToBrewPotions {
    fun minTime(skill: IntArray, mana: IntArray): Long {
        val timeFree = LongArray(skill.size) { 0L }
        for (el in mana) {
            val shift = LongArray(skill.size) { 0L }
            var prev = 0L
            for (i in 0 until skill.size) {
                if (i == 0) {
                    timeFree[i] = timeFree[i] + skill[i] * el
                    prev = timeFree[i]
                } else {
                    if (timeFree[i] <= prev) {
                        timeFree[i] = prev + skill[i] * el
                        prev = timeFree[i]
                    } else {
                        shift[i - 1] = timeFree[i] - prev
                        timeFree[i] = timeFree[i] + skill[i] * el
                        prev = timeFree[i]
                    }
                }
            }
            var totalShift = 0L
            for (i in shift.size - 1 downTo 0) {
                totalShift += shift[i]
                timeFree[i] += totalShift
            }
        }
        return timeFree[skill.size - 1]
    }
}