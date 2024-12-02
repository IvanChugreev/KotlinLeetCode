import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1455_CheckIfAWordOccursAsAPrefixOfAnyWordInASentence_Test {

    @Test
    fun isPrefixOfWord_Test1() {
        assertThat(
            N1455_CheckIfAWordOccursAsAPrefixOfAnyWordInASentence().isPrefixOfWord(
                "i love eating burger",
                "burg"
            )
        ).isEqualTo(4)
    }

    @Test
    fun isPrefixOfWord_Test2() {
        assertThat(
            N1455_CheckIfAWordOccursAsAPrefixOfAnyWordInASentence().isPrefixOfWord(
                "this problem is an easy problem",
                "pro"
            )
        ).isEqualTo(2)
    }

    @Test
    fun isPrefixOfWord_Test3() {
        assertThat(
            N1455_CheckIfAWordOccursAsAPrefixOfAnyWordInASentence().isPrefixOfWord(
                "i am tired",
                "you"
            )
        ).isEqualTo(-1)
    }

    @Test
    fun isPrefixOfWord_Test4() {
        assertThat(N1455_CheckIfAWordOccursAsAPrefixOfAnyWordInASentence().isPrefixOfWord("i", "i"))
            .isEqualTo(1)
    }

    @Test
    fun isPrefixOfWord_Test5() {
        assertThat(
            N1455_CheckIfAWordOccursAsAPrefixOfAnyWordInASentence().isPrefixOfWord(
                "i am tired",
                "tired"
            )
        ).isEqualTo(3)
    }
}