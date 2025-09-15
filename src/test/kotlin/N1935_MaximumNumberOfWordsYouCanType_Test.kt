import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1935_MaximumNumberOfWordsYouCanType_Test {

    @Test
    fun canBeTypedWords_Test1() {
        assertThat(N1935_MaximumNumberOfWordsYouCanType().canBeTypedWords("hello world", "ad"))
            .isEqualTo(1)
    }

    @Test
    fun canBeTypedWords_Test2() {
        assertThat(N1935_MaximumNumberOfWordsYouCanType().canBeTypedWords("leet code", "lt"))
            .isEqualTo(1)
    }

    @Test
    fun canBeTypedWords_Test3() {
        assertThat(N1935_MaximumNumberOfWordsYouCanType().canBeTypedWords("leet code", "e"))
            .isEqualTo(0)
    }
}