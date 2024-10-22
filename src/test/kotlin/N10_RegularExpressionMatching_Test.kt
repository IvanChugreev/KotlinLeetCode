import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N10_RegularExpressionMatching_Test {

    @Test
    fun isMatch_Test1() {
        assertThat(N10_RegularExpressionMatching().isMatch("aa", "a")).isFalse()
    }

    @Test
    fun isMatch_Test2() {
        assertThat(N10_RegularExpressionMatching().isMatch("aa", "a*")).isTrue()
    }

    @Test
    fun isMatch_Test3() {
        assertThat(N10_RegularExpressionMatching().isMatch("aa", ".*")).isTrue()
    }
}