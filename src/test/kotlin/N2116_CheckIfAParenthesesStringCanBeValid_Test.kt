import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2116_CheckIfAParenthesesStringCanBeValid_Test {

    @Test
    fun canBeValid_Test1() {
        assertThat(N2116_CheckIfAParenthesesStringCanBeValid().canBeValid("))()))", "010100")).isTrue()
    }

    @Test
    fun canBeValid_Test2() {
        assertThat(N2116_CheckIfAParenthesesStringCanBeValid().canBeValid("()()", "0000")).isTrue()
    }

    @Test
    fun canBeValid_Test3() {
        assertThat(N2116_CheckIfAParenthesesStringCanBeValid().canBeValid(")", "0")).isFalse()
    }
}