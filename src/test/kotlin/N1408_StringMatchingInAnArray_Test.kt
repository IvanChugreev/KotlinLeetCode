import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1408_StringMatchingInAnArray_Test {

    @Test
    fun stringMatching_Test1() {
        assertThat(N1408_StringMatchingInAnArray().stringMatching(arrayOf("mass", "as", "hero", "superhero")))
            .containsExactlyInAnyOrder("as", "hero")
    }

    @Test
    fun stringMatching_Test2() {
        assertThat(N1408_StringMatchingInAnArray().stringMatching(arrayOf("leetcode","et","code")))
            .containsExactlyInAnyOrder("et","code")
    }

    @Test
    fun stringMatching_Test3() {
        assertThat(N1408_StringMatchingInAnArray().stringMatching(arrayOf("blue","green","bu"))).isEmpty()
    }
}