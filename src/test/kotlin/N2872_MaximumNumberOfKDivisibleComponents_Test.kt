import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2872_MaximumNumberOfKDivisibleComponents_Test {

    @Test
    fun maxKDivisibleComponents_Test1() {
        val edges = arrayOf(intArrayOf(0, 2), intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 4))
        val values = intArrayOf(1, 8, 1, 4, 4)
        assertThat(N2872_MaximumNumberOfKDivisibleComponents().maxKDivisibleComponents(5, edges, values, 6))
            .isEqualTo(2)
    }

    @Test
    fun maxKDivisibleComponents_Test2() {
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 3),
            intArrayOf(1, 4),
            intArrayOf(2, 5),
            intArrayOf(2, 6)
        )
        val values = intArrayOf(3, 0, 6, 1, 5, 2, 1)
        assertThat(N2872_MaximumNumberOfKDivisibleComponents().maxKDivisibleComponents(7, edges, values, 3))
            .isEqualTo(3)
    }
}