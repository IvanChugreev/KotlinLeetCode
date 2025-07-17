import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3202_FindTheMaximumLengthOfValidSubsequenceII_Test {

    @Test
    fun maximumLength_Test1() {
        assertThat(N3202_FindTheMaximumLengthOfValidSubsequenceII().maximumLength(intArrayOf(1, 2, 3, 4, 5), 2))
            .isEqualTo(5)
    }

    @Test
    fun maximumLength_Test2() {
        val nums = intArrayOf(1, 4, 2, 3, 1, 4)
        assertThat(N3202_FindTheMaximumLengthOfValidSubsequenceII().maximumLength(nums, 3))
            .isEqualTo(4)
    }
}