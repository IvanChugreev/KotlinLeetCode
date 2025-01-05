class N2381_ShiftingLetters2 {
    fun shiftingLetters(s: String, shifts: Array<IntArray>): String {
        val diffArray = IntArray(s.length + 1)
        shifts.forEach {
            if (it[2] == 1) {
                ++diffArray[it[0]]
                --diffArray[it[1] + 1]
            } else {
                --diffArray[it[0]]
                ++diffArray[it[1] + 1]
            }
        }
        val result = StringBuilder(s)
        var numberOfShifts = 0
        (0..s.lastIndex).forEach {
            numberOfShifts = (numberOfShifts + diffArray[it]) % 26
            if (numberOfShifts < 0) numberOfShifts += 26
            var shiftedChar = s[it] + numberOfShifts
            if (shiftedChar > 'z') shiftedChar -= 26
            result.setCharAt(it, shiftedChar)
        }
        return result.toString()
    }
}