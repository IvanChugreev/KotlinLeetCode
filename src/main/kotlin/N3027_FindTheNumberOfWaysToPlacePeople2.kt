class N3027_FindTheNumberOfWaysToPlacePeople2 {
    fun numberOfPairs(points: Array<IntArray>): Int {
        points.sortWith(compareBy({ it[0] }, { -it[1] }))
        var pairCount = 0
        for (i in 0 until points.size) {
            val upperY = points[i][1]
            var lowerYLimit = Int.MIN_VALUE
            for (j in i + 1 until points.size) {
                val currentY = points[j][1]
                if (currentY <= upperY && currentY > lowerYLimit) {
                    ++pairCount
                    lowerYLimit = currentY
                    if (currentY == upperY) {
                        break
                    }
                }
            }
        }
        return pairCount
    }
}