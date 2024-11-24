import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1975_MaximumMatrixSum_Test {

    @Test
    fun maxMatrixSum_Test1() {
        val matrix = arrayOf(intArrayOf(1, -1), intArrayOf(-1, 1))
        assertThat(N1975_MaximumMatrixSum().maxMatrixSum(matrix)).isEqualTo(4)
    }

    @Test
    fun maxMatrixSum_Test2() {
        val matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(-1, -2, -3), intArrayOf(1, 2, 3))
        assertThat(N1975_MaximumMatrixSum().maxMatrixSum(matrix)).isEqualTo(16)
    }

    @Test
    fun maxMatrixSum_Test3() {
        val matrix = arrayOf(intArrayOf(2, 9, 3), intArrayOf(5, 4, -4), intArrayOf(1, 7, 1))
        assertThat(N1975_MaximumMatrixSum().maxMatrixSum(matrix)).isEqualTo(34)
    }
}