class N9_PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        var num = x
        var reversed = 0
        var i = 0
        while (num != 0) {
            val digit = num % 10
            if (i == 9) {
                val maxValue = Int.MAX_VALUE / 10
                if (reversed > maxValue || (reversed == maxValue && digit > 7)) return false
            }
            num /= 10
            reversed = reversed * 10 + digit
            ++i
        }
        return reversed == x
    }
}