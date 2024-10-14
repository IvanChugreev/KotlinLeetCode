import kotlin.math.sign

class N7_ReverseInteger {
    fun reverse(x: Int): Int {
        var num = x
        var reversed = 0
        var i = 0
        while (num != 0) {
            val digit = num % 10
            if (i == 9) {
                if (x.sign == 1) {
                    val maxValue = Int.MAX_VALUE / 10
                    if (reversed > maxValue || (reversed == maxValue && digit > 7)) return 0
                } else {
                    val minValue = Int.MIN_VALUE / 10
                    if (reversed < minValue || (reversed == minValue && digit < -8)) return 0
                }
            }
            num /= 10
            reversed = reversed * 10 + digit
            ++i
        }
        return reversed
    }
}