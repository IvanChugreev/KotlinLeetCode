import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1829_MaximumXORForEachQuery_Test {

    @Test
    fun getMaximumXor_Test1() {
        val nums = intArrayOf(0, 1, 1, 3)
        assertThat(N1829_MaximumXORForEachQuery().getMaximumXor(nums, 2)).containsExactly(0, 3, 2, 3)
    }

    @Test
    fun getMaximumXor_Test2() {
        val nums = intArrayOf(2, 3, 4, 7)
        assertThat(N1829_MaximumXORForEachQuery().getMaximumXor(nums, 3)).containsExactly(5, 2, 6, 5)
    }

    @Test
    fun getMaximumXor_Test3() {
        val nums = intArrayOf(0, 1, 2, 2, 5, 7)
        assertThat(N1829_MaximumXORForEachQuery().getMaximumXor(nums, 3)).containsExactly(4, 3, 6, 4, 6, 7)
    }
}