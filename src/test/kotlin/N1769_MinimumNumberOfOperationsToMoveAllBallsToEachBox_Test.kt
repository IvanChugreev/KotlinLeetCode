import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1769_MinimumNumberOfOperationsToMoveAllBallsToEachBox_Test {

    @Test
    fun minOperations_Test1() {
        assertThat(N1769_MinimumNumberOfOperationsToMoveAllBallsToEachBox().minOperations("110"))
            .containsExactly(1, 1, 3)
    }

    @Test
    fun minOperations_Test2() {
        assertThat(N1769_MinimumNumberOfOperationsToMoveAllBallsToEachBox().minOperations("001011"))
            .containsExactly(11, 8, 5, 4, 3, 4)
    }
}