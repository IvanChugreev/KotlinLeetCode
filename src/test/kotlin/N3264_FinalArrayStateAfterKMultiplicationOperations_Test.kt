import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3264_FinalArrayStateAfterKMultiplicationOperations_Test {

    @Test
    fun getFinalState_Test1() {
        val nums = intArrayOf(2, 1, 3, 5, 6)
        assertThat(N3264_FinalArrayStateAfterKMultiplicationOperations().getFinalState(nums, 5, 2))
            .containsExactly(8, 4, 6, 5, 6)
    }

    @Test
    fun getFinalState_Test2() {
        assertThat(N3264_FinalArrayStateAfterKMultiplicationOperations().getFinalState(intArrayOf(1, 2), 3, 4))
            .containsExactly(16, 8)
    }
}