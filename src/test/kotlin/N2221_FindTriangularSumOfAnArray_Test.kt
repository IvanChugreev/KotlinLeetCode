import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2221_FindTriangularSumOfAnArray_Test {

    @Test
    fun triangularSum_Test1() {
        assertThat(N2221_FindTriangularSumOfAnArray().triangularSum(intArrayOf(1, 2, 3, 4, 5))).isEqualTo(8)
    }

    @Test
    fun triangularSum_Test2() {
        assertThat(N2221_FindTriangularSumOfAnArray().triangularSum(intArrayOf(5))).isEqualTo(5)
    }

}