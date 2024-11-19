import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2461_MaximumSumOfDistinctSubarraysWithLengthK_Test {

    @Test
    fun maximumSubarraySum_Test1() {
        val nums = intArrayOf(1, 5, 4, 2, 9, 9, 9)
        assertThat(N2461_MaximumSumOfDistinctSubarraysWithLengthK().maximumSubarraySum(nums, 3)).isEqualTo(15)
    }

    @Test
    fun maximumSubarraySum_Test2() {
        val nums = intArrayOf(4, 4, 4)
        assertThat(N2461_MaximumSumOfDistinctSubarraysWithLengthK().maximumSubarraySum(nums, 3)).isEqualTo(0)
    }

    @Test
    fun maximumSubarraySum_Test3() {
        val nums = intArrayOf(6, 2, 4, 4, 4, 5)
        assertThat(N2461_MaximumSumOfDistinctSubarraysWithLengthK().maximumSubarraySum(nums, 1)).isEqualTo(6)
    }

    @Test
    fun maximumSubarraySum_Test4() {
        val nums = intArrayOf(1, 1, 1, 7, 8, 9)
        assertThat(N2461_MaximumSumOfDistinctSubarraysWithLengthK().maximumSubarraySum(nums, 3)).isEqualTo(24)
    }
}