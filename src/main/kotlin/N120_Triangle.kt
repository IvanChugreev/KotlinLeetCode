class N120_Triangle {
    fun minimumTotal(triangle: List<List<Int>>): Int {
        val dp = triangle.last().toIntArray()
        for (i in triangle.size - 2 downTo 0) {
            for (j in 0..i) {
                dp[j] = triangle[i][j] + minOf(dp[j], dp[j + 1])
            }
        }
        return dp[0]
    }
}