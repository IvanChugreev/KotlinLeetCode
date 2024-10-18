import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2044_CountNumberOfMaximumBitwiseORSubsets_Test {

    @Test
    fun countMaxOrSubsets_Test1() {
        assertThat(N2044_CountNumberOfMaximumBitwiseORSubsets().countMaxOrSubsets(intArrayOf(3, 1))).isEqualTo(2)
    }

    @Test
    fun countMaxOrSubsets_Test2() {
        assertThat(N2044_CountNumberOfMaximumBitwiseORSubsets().countMaxOrSubsets(intArrayOf(2, 2, 2))).isEqualTo(7)
    }

    @Test
    fun countMaxOrSubsets_Test3() {
        assertThat(N2044_CountNumberOfMaximumBitwiseORSubsets().countMaxOrSubsets(intArrayOf(3, 2, 1, 5))).isEqualTo(6)
    }
}