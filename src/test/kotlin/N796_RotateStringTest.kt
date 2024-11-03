import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N796_RotateStringTest {

    @Test
    fun rotateString_Test1() {
        assertThat(N796_RotateString().rotateString("abcde", "cdeab")).isTrue()
    }

    @Test
    fun rotateString_Test2() {
        assertThat(N796_RotateString().rotateString("abcde", "abced")).isFalse()
    }
}