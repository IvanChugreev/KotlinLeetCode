import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2981_FindLongestSpecialSubstringThatOccursThrice_Test {

    @Test
    fun maximumLength_Test1() {
        assertThat(N2981_FindLongestSpecialSubstringThatOccursThrice().maximumLength("aaaa")).isEqualTo(2)
    }

    @Test
    fun maximumLength_Test2() {
        assertThat(N2981_FindLongestSpecialSubstringThatOccursThrice().maximumLength("abcdef")).isEqualTo(-1)
    }

    @Test
    fun maximumLength_Test3() {
        assertThat(N2981_FindLongestSpecialSubstringThatOccursThrice().maximumLength("abcaba")).isEqualTo(1)
    }
}