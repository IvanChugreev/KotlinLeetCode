import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2982_FindLongestSpecialSubstringThatOccursThrice2_Test {

    @Test
    fun maximumLength_Test1() {
        assertThat(N2982_FindLongestSpecialSubstringThatOccursThrice2().maximumLength("aaaa")).isEqualTo(2)
    }

    @Test
    fun maximumLength_Test2() {
        assertThat(N2982_FindLongestSpecialSubstringThatOccursThrice2().maximumLength("abcdef")).isEqualTo(-1)
    }

    @Test
    fun maximumLength_Test3() {
        assertThat(N2982_FindLongestSpecialSubstringThatOccursThrice2().maximumLength("abcaba")).isEqualTo(1)
    }
}