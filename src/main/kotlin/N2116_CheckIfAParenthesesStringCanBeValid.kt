class N2116_CheckIfAParenthesesStringCanBeValid {
    fun canBeValid(s: String, locked: String): Boolean {
        if (s.length and 1 == 1) return false
        var balance = 0
        s.indices.forEach {
            if (s[it] == '(' || locked[it] == '0') ++balance else if (balance > 0) --balance else return false
        }
        balance = 0
        s.indices.reversed().forEach {
            if (s[it] == ')' || locked[it] == '0') ++balance else if (balance > 0) --balance else return false
        }
        return true
    }
}