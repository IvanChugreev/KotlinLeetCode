import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N7_ReverseInteger_Test {

    @Test
    fun reverse_Test1() {
        assertThat(N7_ReverseInteger().reverse(123)).isEqualTo(321)
    }

    @Test
    fun reverse_Test2() {
        assertThat(N7_ReverseInteger().reverse(-123)).isEqualTo(-321)
    }

    @Test
    fun reverse_Test3() {
        assertThat(N7_ReverseInteger().reverse(120)).isEqualTo(21)
    }

    @Test
    fun reverse_Test4() {
        assertThat(N7_ReverseInteger().reverse(2_123_123_112)).isEqualTo(2113213212)
    }

    @Test
    fun reverse_Test5() {
        assertThat(N7_ReverseInteger().reverse(2_123_123_522)).isEqualTo(0)
    }

    @Test
    fun reverse_Test6() {
        assertThat(N7_ReverseInteger().reverse(-2_123_123_112)).isEqualTo(-2113213212)
    }

    @Test
    fun reverse_Test7() {
        assertThat(N7_ReverseInteger().reverse(-2_123_123_522)).isEqualTo(0)
    }

    @Test
    fun reverse_Test8() {
        assertThat(N7_ReverseInteger().reverse(1534236469)).isEqualTo(0)
    }

    @Test
    fun reverse_Test9() {
        assertThat(N7_ReverseInteger().reverse(-2147483412)).isEqualTo(-2143847412)
    }
}