import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2169_CountOperationsToObtainZero_Test {

    @Test
    fun countOperations_Test1() {
        assertThat(N2169_CountOperationsToObtainZero().countOperations(2, 3)).isEqualTo(3)
    }

    @Test
    fun countOperations_Test2() {
        assertThat(N2169_CountOperationsToObtainZero().countOperations(10, 10)).isEqualTo(1)
    }

    @Test
    fun countOperations_Test3() {
        assertThat(N2169_CountOperationsToObtainZero().countOperations(79, 68)).isEqualTo(14)
    }

}