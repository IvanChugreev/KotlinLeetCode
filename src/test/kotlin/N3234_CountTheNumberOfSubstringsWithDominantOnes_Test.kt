import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3234_CountTheNumberOfSubstringsWithDominantOnes_Test {

    @Test
    fun numberOfSubstrings_Test1() {
        assertThat(N3234_CountTheNumberOfSubstringsWithDominantOnes().numberOfSubstrings("00011")).isEqualTo(5)
    }

    @Test
    fun numberOfSubstrings_Test2() {
        assertThat(N3234_CountTheNumberOfSubstringsWithDominantOnes().numberOfSubstrings("101101")).isEqualTo(16)
    }

}