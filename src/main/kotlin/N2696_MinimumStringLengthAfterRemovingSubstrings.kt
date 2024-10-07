class N2696_MinimumStringLengthAfterRemovingSubstrings {
    fun minLength(s: String): Int {
        val stack = mutableListOf<Char>()
        for (char in s) {
            if (stack.isNotEmpty() && ((stack.last() == 'A' && char == 'B') || (stack.last() == 'C' && char == 'D'))) {
                stack.removeAt(stack.size - 1)
            } else {
                stack.add(char)
            }
        }
        return stack.size
    }
}