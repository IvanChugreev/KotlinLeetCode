import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2785_SortVowelsInAString_Test {

    @Test
    fun sortVowels_Test1() {
        assertThat(N2785_SortVowelsInAString().sortVowels("lEetcOde")).isEqualTo("lEOtcede")
    }

    @Test
    fun sortVowels_Test2() {
        assertThat(N2785_SortVowelsInAString().sortVowels("lYmpH")).isEqualTo("lYmpH")
    }

}