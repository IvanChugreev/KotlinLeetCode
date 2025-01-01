import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1422_MaximumScoreAfterSplittingAString_Test {

    @Test
    fun maxScore_Test1() {
        assertThat(N1422_MaximumScoreAfterSplittingAString().maxScore("011101")).isEqualTo(5)
    }

    @Test
    fun maxScore_Test2() {
        assertThat(N1422_MaximumScoreAfterSplittingAString().maxScore("00111")).isEqualTo(5)
    }

    @Test
    fun maxScore_Test3() {
        assertThat(N1422_MaximumScoreAfterSplittingAString().maxScore("1111")).isEqualTo(3)
    }
}