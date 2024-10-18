import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N8_StringToInteger_Atoi_Test {

    @Test
    fun myAtoi_Test1() {
        assertThat(N8_StringToInteger_Atoi().myAtoi("42")).isEqualTo(42)
    }

    @Test
    fun myAtoi_Test2() {
        assertThat(N8_StringToInteger_Atoi().myAtoi(" -042")).isEqualTo(-42)
    }

    @Test
    fun myAtoi_Test3() {
        assertThat(N8_StringToInteger_Atoi().myAtoi("1337c0d3")).isEqualTo(1337)
    }

    @Test
    fun myAtoi_Test4() {
        assertThat(N8_StringToInteger_Atoi().myAtoi("0-1")).isEqualTo(0)
    }

    @Test
    fun myAtoi_Test5() {
        assertThat(N8_StringToInteger_Atoi().myAtoi("words and 987")).isEqualTo(0)
    }

    @Test
    fun myAtoi_Test6() {
        assertThat(N8_StringToInteger_Atoi().myAtoi("")).isEqualTo(0)
    }

    @Test
    fun myAtoi_Test7() {
        assertThat(N8_StringToInteger_Atoi().myAtoi("42123154345646")).isEqualTo(Int.MAX_VALUE)
    }

    @Test
    fun myAtoi_Test8() {
        assertThat(N8_StringToInteger_Atoi().myAtoi("-42123154345646")).isEqualTo(Int.MIN_VALUE)
    }

    @Test
    fun myAtoi_Test9() {
        assertThat(N8_StringToInteger_Atoi().myAtoi("-A")).isEqualTo(0)
    }

    @Test
    fun myAtoi_Test10() {
        assertThat(N8_StringToInteger_Atoi().myAtoi("-00000")).isEqualTo(0)
    }

    @Test
    fun myAtoi_Test11() {
        assertThat(N8_StringToInteger_Atoi().myAtoi("-+12")).isEqualTo(0)
    }

    @Test
    fun myAtoi_Test12() {
        assertThat(N8_StringToInteger_Atoi().myAtoi("9223372036854775808")).isEqualTo(2147483647)
    }

    @Test
    fun myAtoi_Test13() {
        assertThat(N8_StringToInteger_Atoi().myAtoi("21474836460")).isEqualTo(2147483647)
    }
}