class N1400_ConstructKPalindromeStrings {
    fun canConstruct(s: String, k: Int): Boolean {
        if (s.length < k) return false
        if (s.length == k) return true
        return Integer.bitCount(s.fold(0) { acc, symbol -> acc xor (1 shl (symbol - 'a')) }) <= k
    }
}