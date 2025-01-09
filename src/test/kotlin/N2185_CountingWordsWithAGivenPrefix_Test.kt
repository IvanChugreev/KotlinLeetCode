import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2185_CountingWordsWithAGivenPrefix_Test {

    @Test
    fun prefixCount_Test1() {
        val words = arrayOf("pay", "attention", "practice", "attend")
        assertThat(N2185_CountingWordsWithAGivenPrefix().prefixCount(words, "at")).isEqualTo(2)
    }

    @Test
    fun prefixCount_Test2() {
        val words = arrayOf("leetcode", "win", "loops", "success")
        assertThat(N2185_CountingWordsWithAGivenPrefix().prefixCount(words, "code")).isEqualTo(0)
    }
}