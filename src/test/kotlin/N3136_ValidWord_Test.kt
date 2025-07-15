import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3136_ValidWord_Test {

    @Test
    fun isValid_Test1() {
        assertThat(N3136_ValidWord().isValid("234Adas")).isTrue
    }

    @Test
    fun isValid_Test2() {
        assertThat(N3136_ValidWord().isValid("b3")).isFalse
    }

    @Test
    fun isValid_Test3() {
        assertThat(N3136_ValidWord().isValid("a3\$e")).isFalse
    }
}