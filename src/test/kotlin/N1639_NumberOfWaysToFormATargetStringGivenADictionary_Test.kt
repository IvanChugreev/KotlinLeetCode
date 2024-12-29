import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1639_NumberOfWaysToFormATargetStringGivenADictionary_Test {

    @Test
    fun numWays_Test1() {
        val words = arrayOf("acca", "bbbb", "caca")
        assertThat(N1639_NumberOfWaysToFormATargetStringGivenADictionary().numWays(words, "aba")).isEqualTo(6)
    }

    @Test
    fun numWays_Test2() {
        val words = arrayOf("abba", "baab")
        assertThat(N1639_NumberOfWaysToFormATargetStringGivenADictionary().numWays(words, "bab")).isEqualTo(4)
    }
}