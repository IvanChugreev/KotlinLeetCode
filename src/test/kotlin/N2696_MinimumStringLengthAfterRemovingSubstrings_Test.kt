import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2696_MinimumStringLengthAfterRemovingSubstrings_Test {

    @Test
    fun minLength_Test1() {
        assertThat(N2696_MinimumStringLengthAfterRemovingSubstrings().minLength("ABFCACDB")).isEqualTo(2)
    }

    @Test
    fun minLength_Test2() {
        assertThat(N2696_MinimumStringLengthAfterRemovingSubstrings().minLength("ACBBD")).isEqualTo(5)
    }

    @Test
    fun minLength_Test3() {
        assertThat(N2696_MinimumStringLengthAfterRemovingSubstrings().minLength("ABCDABCD")).isEqualTo(0)
    }
}