class N1277_CountSquareSubmatricesWithAllOnes {
    fun countSquares(matrix: Array<IntArray>): Int {
        var sum = 0
        if (matrix.size < matrix[0].size) {
            var prevStep = IntArray(matrix.size)
            var currStep = IntArray(matrix.size)
            for (i in matrix.indices) {
                prevStep[i] = matrix[i][0]
                sum += prevStep[i]
            }
            for (i in 1..<matrix[0].size) {
                currStep[0] = matrix[0][i]
                sum += currStep[0]
                for (j in 1..<matrix.size) {
                    currStep[j] = if (matrix[j][i] == 1) minOf(currStep[j - 1], prevStep[j], prevStep[j - 1]) + 1 else 0
                    sum += currStep[j]
                }
                prevStep = currStep.also { currStep = prevStep }
            }
        } else {
            var prevStep = IntArray(matrix[0].size)
            var currStep = IntArray(matrix[0].size)
            for (i in matrix[0].indices) {
                prevStep[i] = matrix[0][i]
                sum += prevStep[i]
            }
            for (i in 1..<matrix.size) {
                currStep[0] = matrix[i][0]
                sum += currStep[0]
                for (j in 1..<matrix[i].size) {
                    currStep[j] = if (matrix[i][j] == 1) minOf(currStep[j - 1], prevStep[j], prevStep[j - 1]) + 1 else 0
                    sum += currStep[j]
                }
                prevStep = currStep.also { currStep = prevStep }
            }
        }
        return sum
    }
}