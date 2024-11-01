import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1957_DeleteCharactersToMakeFancyString_Test {

    @Test
    fun makeFancyString_Test1() {
        assertThat(N1957_DeleteCharactersToMakeFancyString().makeFancyString("leeetcode")).isEqualTo("leetcode")
    }

    @Test
    fun makeFancyString_Test2() {
        assertThat(N1957_DeleteCharactersToMakeFancyString().makeFancyString("aaabaaaa")).isEqualTo("aabaa")
    }

    @Test
    fun makeFancyString_Test3() {
        assertThat(N1957_DeleteCharactersToMakeFancyString().makeFancyString("aab")).isEqualTo("aab")
    }
}