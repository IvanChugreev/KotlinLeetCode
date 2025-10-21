import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3346_MaximumFrequencyOfAnElementAfterPerformingOperations_Test {

    @Test
    fun maxFrequency_Test1() {
        val nums = intArrayOf(1, 4, 5)
        assertThat(N3346_MaximumFrequencyOfAnElementAfterPerformingOperations().maxFrequency(nums, 1, 2))
            .isEqualTo(2)
    }

    @Test
    fun maxFrequency_Test2() {
        val nums = intArrayOf(5, 11, 20, 20)
        assertThat(N3346_MaximumFrequencyOfAnElementAfterPerformingOperations().maxFrequency(nums, 5, 1))
            .isEqualTo(2)
    }

}