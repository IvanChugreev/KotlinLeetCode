class N12_IntegerToRoman {
    fun intToRoman(num: Int): String {
        val romanNumerals = arrayOf("I", "V", "X", "L", "C", "D", "M")
        var tempNum = num
        var i = 0
        val roman = StringBuilder()
        while (tempNum > 0) {
            val digit = tempNum % 10
            if (digit < 4) {
                roman.insert(0, romanNumerals[i].repeat(digit))
            } else if (digit == 4) {
                roman.insert(0, romanNumerals[i] + romanNumerals[i + 1])
            } else if (digit < 9) {
                roman.insert(0, romanNumerals[i + 1] + romanNumerals[i].repeat(digit - 5))
            } else {
                roman.insert(0, romanNumerals[i] + romanNumerals[i + 2])
            }
            i += 2
            tempNum /= 10
        }
        return roman.toString()
    }
}