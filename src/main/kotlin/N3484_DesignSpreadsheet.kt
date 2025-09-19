class N3484_DesignSpreadsheet {
    class Spreadsheet(rows: Int) {

        private val cellMap: MutableMap<String, Int> = HashMap()

        fun setCell(cell: String, value: Int) {
            cellMap[cell] = value
        }

        fun resetCell(cell: String) {
            cellMap.remove(cell)
        }

        fun getValue(formula: String): Int =
            formula.drop(1)
                .split('+')
                .sumOf { term -> if (term[0].isDigit()) term.toInt() else cellMap[term] ?: 0 }

    }
}