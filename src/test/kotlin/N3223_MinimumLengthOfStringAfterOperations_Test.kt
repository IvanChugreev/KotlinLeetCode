import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3223_MinimumLengthOfStringAfterOperations_Test {

    @Test
    fun minimumLength_Test1() {
        assertThat(N3223_MinimumLengthOfStringAfterOperations().minimumLength("abaacbcbb")).isEqualTo(5)
    }

    @Test
    fun minimumLength_Test2() {
        assertThat(N3223_MinimumLengthOfStringAfterOperations().minimumLength("aa")).isEqualTo(2)
    }
}