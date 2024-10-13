import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N962_MaximumWidthRamp_Test {

    @Test
    fun maxWidthRamp_Test1() {
        assertThat(N962_MaximumWidthRamp().maxWidthRamp(intArrayOf(6,0,8,2,1,5))).isEqualTo(4)
    }

    @Test
    fun maxWidthRamp_Test2() {
        assertThat(N962_MaximumWidthRamp().maxWidthRamp(intArrayOf(9,8,1,0,1,9,4,0,4,1))).isEqualTo(7)
    }
}