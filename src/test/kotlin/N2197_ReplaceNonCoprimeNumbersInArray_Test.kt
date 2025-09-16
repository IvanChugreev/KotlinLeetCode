import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2197_ReplaceNonCoprimeNumbersInArray_Test {

    @Test
    fun replaceNonCoprimes_Test1() {
        assertThat(N2197_ReplaceNonCoprimeNumbersInArray().replaceNonCoprimes(intArrayOf(6, 4, 3, 2, 7, 6, 2)))
            .containsExactly(12, 7, 6)
    }

    @Test
    fun replaceNonCoprimes_Test2() {
        assertThat(N2197_ReplaceNonCoprimeNumbersInArray().replaceNonCoprimes(intArrayOf(2, 2, 1, 1, 3, 3, 3)))
            .containsExactly(2, 1, 1, 3)
    }

}