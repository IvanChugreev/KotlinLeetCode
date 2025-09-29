class N1039_MinimumScoreTriangulationOfPolygon {
    fun minScoreTriangulation(values: IntArray): Int {
        val n = values.size
        val dp = Array(n) { IntArray(n) { -1 } }
        fun solve(i: Int, j: Int): Int = when {
            i + 1 == j -> 0
            dp[i][j] != -1 -> dp[i][j]
            else -> {
                var ans = Int.MAX_VALUE
                for (k in i + 1 until j) {
                    val cost = values[i] * values[k] * values[j] + solve(i, k) + solve(k, j)
                    ans = minOf(ans, cost)
                }
                ans.also { dp[i][j] = it }
            }
        }
        return solve(0, n - 1)
    }
}