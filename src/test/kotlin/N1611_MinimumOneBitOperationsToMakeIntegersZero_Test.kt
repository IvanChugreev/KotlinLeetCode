import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1611_MinimumOneBitOperationsToMakeIntegersZero_Test {

    @Test
    fun minimumOneBitOperations_Test1() {
        assertThat(N1611_MinimumOneBitOperationsToMakeIntegersZero().minimumOneBitOperations(3)).isEqualTo(2)
    }

    @Test
    fun minimumOneBitOperations_Test2() {
        assertThat(N1611_MinimumOneBitOperationsToMakeIntegersZero().minimumOneBitOperations(6)).isEqualTo(4)
    }

    @Test
    fun minimumOneBitOperations_Test3() {
        assertThat(N1611_MinimumOneBitOperationsToMakeIntegersZero().minimumOneBitOperations(5)).isEqualTo(6)
    }

    @Test
    fun minimumOneBitOperations_Test4() {
        assertThat(N1611_MinimumOneBitOperationsToMakeIntegersZero().minimumOneBitOperations(8)).isEqualTo(15)
    }

}