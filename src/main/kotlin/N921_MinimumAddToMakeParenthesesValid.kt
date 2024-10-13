class N921_MinimumAddToMakeParenthesesValid {
    fun minAddToMakeValid(s: String): Int {
        var balance = 0
        var reserve = 0
        s.forEach { if (it == '(') ++reserve else if (reserve == 0) ++balance else --reserve }
        return balance + reserve
    }
}
