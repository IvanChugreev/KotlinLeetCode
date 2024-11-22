import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1072_FlipColumnsForMaximumNumberOfEqualRowsTest {

    @Test
    fun maxEqualRowsAfterFlips_Test1() {
        val matrix = arrayOf(intArrayOf(0, 1), intArrayOf(1, 1))
        assertThat(N1072_FlipColumnsForMaximumNumberOfEqualRows().maxEqualRowsAfterFlips(matrix)).isEqualTo(1)
    }

    @Test
    fun maxEqualRowsAfterFlips_Test2() {
        val matrix = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0))
        assertThat(N1072_FlipColumnsForMaximumNumberOfEqualRows().maxEqualRowsAfterFlips(matrix)).isEqualTo(2)
    }

    @Test
    fun maxEqualRowsAfterFlips_Test3() {
        val matrix = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 1), intArrayOf(1, 1, 0))
        assertThat(N1072_FlipColumnsForMaximumNumberOfEqualRows().maxEqualRowsAfterFlips(matrix)).isEqualTo(2)
    }
}