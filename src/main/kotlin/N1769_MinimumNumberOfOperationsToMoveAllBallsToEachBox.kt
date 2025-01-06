class N1769_MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    fun minOperations(boxes: String): IntArray {
        val result = IntArray(boxes.length)
        var ballsToLeft = 0
        var movesToLeft = 0
        var ballsToRight = 0
        var movesToRight = 0
        (boxes.lastIndex downTo 0).forEachIndexed { i, j ->
            result[i] += movesToLeft
            if (boxes[i] == '1') ++ballsToLeft
            movesToLeft += ballsToLeft
            result[j] += movesToRight
            if (boxes[j] == '1') ++ballsToRight
            movesToRight += ballsToRight
        }
        return result
    }
}