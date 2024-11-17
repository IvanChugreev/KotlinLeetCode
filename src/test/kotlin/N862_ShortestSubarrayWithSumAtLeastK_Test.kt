import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N862_ShortestSubarrayWithSumAtLeastK_Test {

    @Test
    fun shortestSubarray_Test1() {
        assertThat(N862_ShortestSubarrayWithSumAtLeastK().shortestSubarray(intArrayOf(1), 1)).isEqualTo(1)
    }

    @Test
    fun shortestSubarray_Test2() {
        assertThat(N862_ShortestSubarrayWithSumAtLeastK().shortestSubarray(intArrayOf(1, 2), 4)).isEqualTo(-1)
    }

    @Test
    fun shortestSubarray_Test3() {
        val nums = intArrayOf(2, -1, 2)
        assertThat(N862_ShortestSubarrayWithSumAtLeastK().shortestSubarray(nums, 3)).isEqualTo(3)
    }
}