import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3163_StringCompression3_Test {

    @Test
    fun compressedString_Test1() {
        assertThat(N3163_StringCompression3().compressedString("abcde")).isEqualTo("1a1b1c1d1e")
    }

    @Test
    fun compressedString_Test2() {
        assertThat(N3163_StringCompression3().compressedString("aaaaaaaaaaaaaabb")).isEqualTo("9a5a2b")
    }

    @Test
    fun compressedString_Test3() {
        assertThat(N3163_StringCompression3().compressedString("a")).isEqualTo("1a")
    }
}