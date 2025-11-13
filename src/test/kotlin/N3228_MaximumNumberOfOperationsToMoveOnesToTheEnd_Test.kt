import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3228_MaximumNumberOfOperationsToMoveOnesToTheEnd_Test {

    @Test
    fun maxOperations_Test1() {
        assertThat(N3228_MaximumNumberOfOperationsToMoveOnesToTheEnd().maxOperations("1001101")).isEqualTo(4)
    }

    @Test
    fun maxOperations_Test2() {
        assertThat(N3228_MaximumNumberOfOperationsToMoveOnesToTheEnd().maxOperations("00111")).isEqualTo(0)
    }

}