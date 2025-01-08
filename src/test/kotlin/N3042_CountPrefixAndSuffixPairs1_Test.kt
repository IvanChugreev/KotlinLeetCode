import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3042_CountPrefixAndSuffixPairs1_Test {

    @Test
    fun countPrefixSuffixPairs_Test1() {
        assertThat(N3042_CountPrefixAndSuffixPairs1().countPrefixSuffixPairs(arrayOf("a", "aba", "ababa", "aa")))
            .isEqualTo(4)
    }

    @Test
    fun countPrefixSuffixPairs_Test2() {
        assertThat(N3042_CountPrefixAndSuffixPairs1().countPrefixSuffixPairs(arrayOf("pa", "papa", "ma", "mama")))
            .isEqualTo(2)
    }

    @Test
    fun countPrefixSuffixPairs_Test3() {
        assertThat(N3042_CountPrefixAndSuffixPairs1().countPrefixSuffixPairs(arrayOf("abab", "ab")))
            .isEqualTo(0)
    }
}