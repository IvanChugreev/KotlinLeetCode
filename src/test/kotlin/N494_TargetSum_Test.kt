import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N494_TargetSum_Test {

    @Test
    fun findTargetSumWays_Test1() {
        assertThat(N494_TargetSum().findTargetSumWays(intArrayOf(1, 1, 1, 1, 1), 3)).isEqualTo(5)
    }

    @Test
    fun findTargetSumWays_Test2() {
        assertThat(N494_TargetSum().findTargetSumWays(intArrayOf(1), 1)).isEqualTo(1)
    }
}