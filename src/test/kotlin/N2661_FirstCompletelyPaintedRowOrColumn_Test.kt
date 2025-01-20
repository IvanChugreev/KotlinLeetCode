import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2661_FirstCompletelyPaintedRowOrColumn_Test {

    @Test
    fun firstCompleteIndex_Test1() {
        val arr = intArrayOf(1, 3, 4, 2)
        val mat = arrayOf(intArrayOf(1, 4), intArrayOf(2, 3))
        assertThat(N2661_FirstCompletelyPaintedRowOrColumn().firstCompleteIndex(arr, mat)).isEqualTo(2)
    }

    @Test
    fun firstCompleteIndex_Test2() {
        val arr = intArrayOf(2, 8, 7, 4, 1, 3, 5, 6, 9)
        val mat = arrayOf(intArrayOf(3, 2, 5), intArrayOf(1, 4, 6), intArrayOf(8, 7, 9))
        assertThat(N2661_FirstCompletelyPaintedRowOrColumn().firstCompleteIndex(arr, mat)).isEqualTo(3)
    }
}