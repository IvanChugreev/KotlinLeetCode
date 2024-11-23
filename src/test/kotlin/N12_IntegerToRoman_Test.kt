import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N12_IntegerToRoman_Test {

    @Test
    fun intToRoman_Test1() {
        assertThat(N12_IntegerToRoman().intToRoman(3749)).isEqualTo("MMMDCCXLIX")
    }

    @Test
    fun intToRoman_Test2() {
        assertThat(N12_IntegerToRoman().intToRoman(58)).isEqualTo("LVIII")
    }

    @Test
    fun intToRoman_Test3() {
        assertThat(N12_IntegerToRoman().intToRoman(1994)).isEqualTo("MCMXCIV")
    }

    @Test
    fun intToRoman_Test4() {
        assertThat(N12_IntegerToRoman().intToRoman(1)).isEqualTo("I")
    }

    @Test
    fun intToRoman_Test5() {
        assertThat(N12_IntegerToRoman().intToRoman(3999)).isEqualTo("MMMCMXCIX")
    }
}