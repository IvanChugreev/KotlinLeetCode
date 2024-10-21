class N1593_SplitAStringIntoTheMaxNumberOfUniqueSubstrings {
    fun maxUniqueSplit(s: String): Int {
        val maxCount = IntArray(1)
        backtrack(s, 0, HashSet(), 0, maxCount)
        return maxCount[0]
    }

    private fun backtrack(
        s: String,
        start: Int,
        seen: MutableSet<String>,
        count: Int,
        maxCount: IntArray
    ) {
        if (count + (s.length - start) <= maxCount[0]) return
        if (start == s.length) {
            if (maxCount[0] < count) maxCount[0] = count
            return
        }
        val substring = StringBuilder()
        for (end in start..<s.length) {
            val currSubstring = substring.append(s[end]).toString()
            if (!seen.contains(currSubstring)) {
                seen.add(currSubstring)
                backtrack(s, end + 1, seen, count + 1, maxCount)
                seen.remove(currSubstring)
            }
        }
        val sb = StringBuilder()
        sb.hashCode()
    }
}