import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1018_BinaryPrefixDivisibleBy5_Test {

    @Test
    fun prefixesDivBy5_Test1() {
        assertThat(N1018_BinaryPrefixDivisibleBy5().prefixesDivBy5(intArrayOf(0, 1, 1)))
            .containsExactly(true, false, false)
    }

    @Test
    fun prefixesDivBy5_Test2() {
        assertThat(N1018_BinaryPrefixDivisibleBy5().prefixesDivBy5(intArrayOf(1, 1, 1)))
            .containsExactly(false, false, false)
    }

    @Test
    fun prefixesDivBy5_Test3() {
        assertThat(N1018_BinaryPrefixDivisibleBy5().prefixesDivBy5(intArrayOf(0, 1, 1, 1, 1, 1)))
            .containsExactly(true, false, false, false, true, false)
    }

}