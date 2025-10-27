class N2125_NumberOfLaserBeamsInABank {
    fun numberOfBeams(bank: Array<String>): Int {
        var prev = 0
        var result = 0
        for (row in bank) {
            var curr = 0
            for (device in row) {
                if (device == '1') {
                    ++curr
                }
            }
            if (curr > 0) {
                result += curr * prev
                prev = curr
            }
        }
        return result
    }
}