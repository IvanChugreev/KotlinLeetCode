import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N9_PalindromeNumber_Test {

    @Test
    fun isPalindrome_Test1() {
        assertThat(N9_PalindromeNumber().isPalindrome(121)).isTrue()
    }

    @Test
    fun isPalindrome_Test2() {
        assertThat(N9_PalindromeNumber().isPalindrome(-121)).isFalse()
    }

    @Test
    fun isPalindrome_Test3() {
        assertThat(N9_PalindromeNumber().isPalindrome(10)).isFalse()
    }

    @Test
    fun isPalindrome_Test4() {
        assertThat(N9_PalindromeNumber().isPalindrome(0)).isTrue()
    }

    @Test
    fun isPalindrome_Test5() {
        assertThat(N9_PalindromeNumber().isPalindrome(Int.MAX_VALUE)).isFalse()
    }
}