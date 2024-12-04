import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2825_MakeStringASubsequenceUsingCyclicIncrements_Test {

    @Test
    fun canMakeSubsequence_Test1() {
        assertThat(N2825_MakeStringASubsequenceUsingCyclicIncrements().canMakeSubsequence("abc", "ad"))
            .isTrue()
    }

    @Test
    fun canMakeSubsequence_Test2() {
        assertThat(N2825_MakeStringASubsequenceUsingCyclicIncrements().canMakeSubsequence("zc", "ad"))
            .isTrue()
    }

    @Test
    fun canMakeSubsequence_Test3() {
        assertThat(N2825_MakeStringASubsequenceUsingCyclicIncrements().canMakeSubsequence("ab", "d"))
            .isFalse()
    }
}