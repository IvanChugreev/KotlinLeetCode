class N1861_RotatingTheBox {
    fun rotateTheBox(box: Array<CharArray>): Array<CharArray> {
        val m = box.size
        val n = box[0].size
        val rotateBox = Array(n) { CharArray(m) { '.' } }
        for (i in 0..<m) {
            var lowestRowWithEmptyCell = n - 1
            for (j in n - 1 downTo 0) {
                if (box[i][j] == '#') {
                    rotateBox[lowestRowWithEmptyCell--][m - i - 1] = '#'
                } else if (box[i][j] == '*') {
                    rotateBox[j][m - i - 1] = '*'
                    lowestRowWithEmptyCell = j - 1
                }
            }
        }
        return rotateBox
    }
}