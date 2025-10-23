import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3461_CheckIfDigitsAreEqualInStringAfterOperations_Test {

    @Test
    fun hasSameDigits_Test1() {
        assertThat(N3461_CheckIfDigitsAreEqualInStringAfterOperations().hasSameDigits("3902")).isTrue
    }

    @Test
    fun hasSameDigits_Test2() {
        assertThat(N3461_CheckIfDigitsAreEqualInStringAfterOperations().hasSameDigits("34789")).isFalse
    }

}