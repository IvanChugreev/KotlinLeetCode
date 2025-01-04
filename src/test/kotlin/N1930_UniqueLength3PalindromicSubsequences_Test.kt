import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1930_UniqueLength3PalindromicSubsequences_Test {

    @Test
    fun countPalindromicSubsequence_Test1() {
        assertThat(N1930_UniqueLength3PalindromicSubsequences().countPalindromicSubsequence("aabca")).isEqualTo(3)
    }

    @Test
    fun countPalindromicSubsequence_Test2() {
        assertThat(N1930_UniqueLength3PalindromicSubsequences().countPalindromicSubsequence("adc")).isEqualTo(0)
    }

    @Test
    fun countPalindromicSubsequence_Test3() {
        assertThat(N1930_UniqueLength3PalindromicSubsequences().countPalindromicSubsequence("bbcbaba")).isEqualTo(4)
    }
}