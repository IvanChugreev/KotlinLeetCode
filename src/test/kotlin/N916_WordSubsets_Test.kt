import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N916_WordSubsets_Test {

    @Test
    fun wordSubsets_Test1() {
        val words1 = arrayOf("amazon", "apple", "facebook", "google", "leetcode")
        assertThat(N916_WordSubsets().wordSubsets(words1, arrayOf("e", "o")))
            .containsExactlyInAnyOrder("facebook", "google", "leetcode")
    }

    @Test
    fun wordSubsets_Test2() {
        val words1 = arrayOf("amazon", "apple", "facebook", "google", "leetcode")
        assertThat(N916_WordSubsets().wordSubsets(words1, arrayOf("l", "e")))
            .containsExactlyInAnyOrder("apple", "google", "leetcode")
    }
}