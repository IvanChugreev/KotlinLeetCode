import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N921_MinimumAddToMakeParenthesesValid_Test {

    @Test
    fun minAddToMakeValid_Test1() {
        assertThat(N921_MinimumAddToMakeParenthesesValid().minAddToMakeValid("())")).isEqualTo(1)
    }

    @Test
    fun minAddToMakeValid_Test2() {
        assertThat(N921_MinimumAddToMakeParenthesesValid().minAddToMakeValid("(((")).isEqualTo(3)
    }
}