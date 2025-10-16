import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2598_SmallestMissingNonNegativeIntegerAfterOperations_Test {

    @Test
    fun findSmallestInteger_Test1() {
        val nums = intArrayOf(1, -10, 7, 13, 6, 8)
        assertThat(N2598_SmallestMissingNonNegativeIntegerAfterOperations().findSmallestInteger(nums, 5)).isEqualTo(4)
    }

    @Test
    fun findSmallestInteger_Test2() {
        val nums = intArrayOf(1, -10, 7, 13, 6, 8)
        assertThat(N2598_SmallestMissingNonNegativeIntegerAfterOperations().findSmallestInteger(nums, 7)).isEqualTo(2)
    }

}