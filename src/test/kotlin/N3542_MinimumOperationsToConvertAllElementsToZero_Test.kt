import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3542_MinimumOperationsToConvertAllElementsToZero_Test {

    @Test
    fun minOperations_Test1() {
        assertThat(N3542_MinimumOperationsToConvertAllElementsToZero().minOperations(intArrayOf(0, 2))).isEqualTo(1)
    }

    @Test
    fun minOperations_Test2() {
        assertThat(N3542_MinimumOperationsToConvertAllElementsToZero().minOperations(intArrayOf(3, 1, 2, 1)))
            .isEqualTo(3)
    }

    @Test
    fun minOperations_Test3() {
        assertThat(N3542_MinimumOperationsToConvertAllElementsToZero().minOperations(intArrayOf(1, 2, 1, 2, 1, 2)))
            .isEqualTo(4)
    }

}