import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3484_DesignSpreadsheet_Test {

    @Test
    fun spreadsheet_Test1() {
        val spreadsheet = N3484_DesignSpreadsheet.Spreadsheet(3)
        val results = mutableListOf<Int?>()
        results += spreadsheet.getValue("=5+7")
        spreadsheet.setCell("A1", 10)
        results += spreadsheet.getValue("=A1+6")
        spreadsheet.setCell("B2", 15)
        results += spreadsheet.getValue("=A1+B2")
        spreadsheet.resetCell("A1")
        results += spreadsheet.getValue("=A1+B2")
        assertThat(results).containsExactly(12, 16, 25, 15)
    }
}