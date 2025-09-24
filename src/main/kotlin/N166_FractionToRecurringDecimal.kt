import kotlin.math.abs

class N166_FractionToRecurringDecimal {
    fun fractionToDecimal(numerator: Int, denominator: Int): String {
        if (numerator == 0) return "0"
        val fraction = StringBuilder()
        if ((numerator < 0) xor (denominator < 0)) {
            fraction.append("-")
        }
        val dividend = abs(numerator.toLong())
        val divisor = abs(denominator.toLong())
        fraction.append(dividend / divisor)
        var remainder = dividend % divisor
        if (remainder == 0L) {
            return fraction.toString()
        }
        fraction.append(".")
        val posByRemainder = mutableMapOf<Long, Int>()
        while (remainder != 0L) {
            if (remainder in posByRemainder) {
                fraction.insert(posByRemainder[remainder]!!, "(").append(")")
                break
            }
            posByRemainder[remainder] = fraction.length
            remainder *= 10
            fraction.append(remainder / divisor)
            remainder %= divisor
        }
        return fraction.toString()
    }
}