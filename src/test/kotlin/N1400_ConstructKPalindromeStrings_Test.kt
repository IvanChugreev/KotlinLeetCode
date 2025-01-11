import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1400_ConstructKPalindromeStrings_Test {

    @Test
    fun canConstruct_Test1() {
        assertThat(N1400_ConstructKPalindromeStrings().canConstruct("annabelle", 2)).isTrue()
    }

    @Test
    fun canConstruct_Test2() {
        assertThat(N1400_ConstructKPalindromeStrings().canConstruct("leetcode", 3)).isFalse()
    }

    @Test
    fun canConstruct_Test3() {
        assertThat(N1400_ConstructKPalindromeStrings().canConstruct("true", 4)).isTrue()
    }
}