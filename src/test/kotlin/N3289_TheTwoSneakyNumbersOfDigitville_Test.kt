import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3289_TheTwoSneakyNumbersOfDigitville_Test {

    @Test
    fun getSneakyNumbers_Test1() {
        assertThat(N3289_TheTwoSneakyNumbersOfDigitville().getSneakyNumbers(intArrayOf(0, 1, 1, 0)))
            .containsExactlyInAnyOrder(0, 1)
    }

    @Test
    fun getSneakyNumbers_Test2() {
        assertThat(N3289_TheTwoSneakyNumbersOfDigitville().getSneakyNumbers(intArrayOf(0, 3, 2, 1, 3, 2)))
            .containsExactlyInAnyOrder(2, 3)
    }

    @Test
    fun getSneakyNumbers_Test3() {
        val nums = intArrayOf(7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2)
        assertThat(N3289_TheTwoSneakyNumbersOfDigitville().getSneakyNumbers(nums)).containsExactlyInAnyOrder(4, 5)
    }

}