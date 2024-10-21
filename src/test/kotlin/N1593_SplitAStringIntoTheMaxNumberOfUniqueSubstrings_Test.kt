import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1593_SplitAStringIntoTheMaxNumberOfUniqueSubstrings_Test {

    @Test
    fun maxUniqueSplit_Test1() {
        assertThat(N1593_SplitAStringIntoTheMaxNumberOfUniqueSubstrings().maxUniqueSplit("ababccc")).isEqualTo(5)
    }

    @Test
    fun maxUniqueSplit_Test2() {
        assertThat(N1593_SplitAStringIntoTheMaxNumberOfUniqueSubstrings().maxUniqueSplit("aba")).isEqualTo(2)
    }

    @Test
    fun maxUniqueSplit_Test3() {
        assertThat(N1593_SplitAStringIntoTheMaxNumberOfUniqueSubstrings().maxUniqueSplit("aa")).isEqualTo(1)
    }
}