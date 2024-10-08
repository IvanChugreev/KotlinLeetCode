class N1963_MinimumNumberOfSwapsToMakeTheStringBalanced {
    fun minSwaps(s: String): Int {
        var balance = 0
        var reserve = 0
        s.forEach { if (it == '[') ++reserve else if (reserve == 0) ++balance else --reserve }
        return (balance + 1) shr 1
    }
}