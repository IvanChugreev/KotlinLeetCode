import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1106_ParsingABooleanExpression_Test {

    @Test
    fun parseBoolExpr_Test1() {
        assertThat(N1106_ParsingABooleanExpression().parseBoolExpr("&(|(f))")).isFalse()
    }

    @Test
    fun parseBoolExpr_Test2() {
        assertThat(N1106_ParsingABooleanExpression().parseBoolExpr("|(f,f,f,t)")).isTrue()
    }

    @Test
    fun parseBoolExpr_Test3() {
        assertThat(N1106_ParsingABooleanExpression().parseBoolExpr("!(&(f,t))")).isTrue()
    }

    @Test
    fun parseBoolExpr_Test4() {
        assertThat(N1106_ParsingABooleanExpression().parseBoolExpr("t")).isTrue()
    }

    @Test
    fun parseBoolExpr_Test5() {
        assertThat(N1106_ParsingABooleanExpression().parseBoolExpr("!(&(t,|(f,t),&(t,f,t),f))")).isTrue()
    }
}