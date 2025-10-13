import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2273_FindResultantArrayAfterRemovingAnagrams_Test {

    @Test
    fun removeAnagrams_Test1() {
        val words = arrayOf("abba", "baba", "bbaa", "cd", "cd")
        assertThat(N2273_FindResultantArrayAfterRemovingAnagrams().removeAnagrams(words)).containsExactly("abba", "cd")
    }

    @Test
    fun removeAnagrams_Test2() {
        assertThat(N2273_FindResultantArrayAfterRemovingAnagrams().removeAnagrams(arrayOf("a", "b", "c", "d", "e")))
            .containsExactly("a", "b", "c", "d", "e")
    }

}