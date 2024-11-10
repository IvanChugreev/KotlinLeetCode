import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3097_ShortestSubarrayWithORAtLeastK2_Test {

    @Test
    fun minimumSubarrayLength_Test1() {
        val nums = intArrayOf(1, 2, 3)
        assertThat(N3097_ShortestSubarrayWithORAtLeastK2().minimumSubarrayLength(nums, 2)).isEqualTo(1)
    }

    @Test
    fun minimumSubarrayLength_Test2() {
        val nums = intArrayOf(2, 1, 8)
        assertThat(N3097_ShortestSubarrayWithORAtLeastK2().minimumSubarrayLength(nums, 10)).isEqualTo(3)
    }

    @Test
    fun minimumSubarrayLength_Test3() {
        val nums = intArrayOf(1, 2)
        assertThat(N3097_ShortestSubarrayWithORAtLeastK2().minimumSubarrayLength(nums, 0)).isEqualTo(1)
    }

    @Test
    fun minimumSubarrayLength_Test4() {
        val nums = intArrayOf(1, 2)
        assertThat(N3097_ShortestSubarrayWithORAtLeastK2().minimumSubarrayLength(nums, 4)).isEqualTo(-1)
    }
}