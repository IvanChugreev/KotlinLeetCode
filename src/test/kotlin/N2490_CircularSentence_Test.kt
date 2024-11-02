import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2490_CircularSentence_Test {

    @Test
    fun isCircularSentence_Test1() {
        assertThat(N2490_CircularSentence().isCircularSentence("leetcode exercises sound delightful")).isTrue()
    }

    @Test
    fun isCircularSentence_Test2() {
        assertThat(N2490_CircularSentence().isCircularSentence("eetcode")).isTrue()
    }

    @Test
    fun isCircularSentence_Test3() {
        assertThat(N2490_CircularSentence().isCircularSentence("Leetcode is cool")).isFalse()
    }

    @Test
    fun isCircularSentence_Test4() {
        assertThat(N2490_CircularSentence().isCircularSentence("a")).isTrue()
    }
}