import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2559_CountVowelStringsInRanges_Test {

    @Test
    fun vowelStrings_Test1() {
        val words = arrayOf("aba", "bcb", "ece", "aa", "e")
        val queries = arrayOf(intArrayOf(0, 2), intArrayOf(1, 4), intArrayOf(1, 1))
        assertThat(N2559_CountVowelStringsInRanges().vowelStrings(words, queries)).containsExactly(2, 3, 0)
    }

    @Test
    fun vowelStrings_Test2() {
        val words = arrayOf("a", "e", "i")
        val queries = arrayOf(intArrayOf(0, 2), intArrayOf(0, 1), intArrayOf(2, 2))
        assertThat(N2559_CountVowelStringsInRanges().vowelStrings(words, queries)).containsExactly(3, 2, 1)
    }
}