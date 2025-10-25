class N1716_CalculateMoneyInLeetcodeBank {
    fun totalMoney(n: Int): Int {
        val cell = n / 7
        val rem = n % 7
        return (7 * (7 + cell) * cell + ((cell shl 1) + rem + 1) * rem) shr 1
    }
}