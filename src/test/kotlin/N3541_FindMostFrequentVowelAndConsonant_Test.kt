import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3541_FindMostFrequentVowelAndConsonant_Test {

    @Test
    fun maxFreqSum_Test1() {
        assertThat(N3541_FindMostFrequentVowelAndConsonant().maxFreqSum("successes")).isEqualTo(6)
    }

    @Test
    fun maxFreqSum_Test2() {
        assertThat(N3541_FindMostFrequentVowelAndConsonant().maxFreqSum("aeiaeia")).isEqualTo(3)
    }

}