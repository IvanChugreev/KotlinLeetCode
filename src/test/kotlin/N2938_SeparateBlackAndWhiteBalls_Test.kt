import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2938_SeparateBlackAndWhiteBalls_Test {

    @Test
    fun minimumSteps_Test1() {
        assertThat(N2938_SeparateBlackAndWhiteBalls().minimumSteps("101")).isEqualTo(1)
    }

    @Test
    fun minimumSteps_Test2() {
        assertThat(N2938_SeparateBlackAndWhiteBalls().minimumSteps("100")).isEqualTo(2)
    }

    @Test
    fun minimumSteps_Test3() {
        assertThat(N2938_SeparateBlackAndWhiteBalls().minimumSteps("0111")).isEqualTo(0)
    }

    @Test
    fun minimumSteps_Test4() {
        assertThat(N2938_SeparateBlackAndWhiteBalls().minimumSteps("11000111")).isEqualTo(6)
    }
}