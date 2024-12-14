import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2762_ContinuousSubarrays_Test {

    @Test
    fun continuousSubarrays_Test1() {
        assertThat(N2762_ContinuousSubarrays().continuousSubarrays(intArrayOf(5, 4, 2, 4))).isEqualTo(8)
    }

    @Test
    fun continuousSubarrays_Test2() {
        assertThat(N2762_ContinuousSubarrays().continuousSubarrays(intArrayOf(1, 2, 3))).isEqualTo(6)
    }

    @Test
    fun continuousSubarrays_Test3() {
        assertThat(N2762_ContinuousSubarrays().continuousSubarrays(intArrayOf(5, 4, 4, 2, 4))).isEqualTo(13)
    }
}