class N8_StringToInteger_Atoi {
    fun myAtoi(s: String): Int {
        var i = s.indexOfFirst { it != ' ' }
        if (i == -1) return 0
        var sign = 1
        if (s[i] == '-') {
            sign = -1
            if (s.length <= ++i) return 0
        } else if (s[i] == '+' && s.length <= ++i) return 0
        if (!s[i].isDigit()) return 0
        while (s[i] == '0') if (s.length <= ++i) return 0
        var cnt = 0
        var ans = 0
        while (i < s.length && s[i].isDigit()) {
            if (++cnt == 10) {
                var digit = s[i] - '0'
                if (sign == 1) {
                    val maxValue = Int.MAX_VALUE / 10
                    if (ans > maxValue || (ans == maxValue && digit > 7)) return Int.MAX_VALUE
                } else {
                    val minValue = Int.MIN_VALUE / 10
                    ans = -ans
                    digit = -digit
                    if (ans < minValue || (ans == minValue && digit < -8)) return Int.MIN_VALUE
                }
                return if (++i < s.length && s[i].isDigit()) if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE else ans * 10 + digit
            }
            ans = ans * 10 + (s[i++] - '0')
        }
        return ans * sign
    }
}