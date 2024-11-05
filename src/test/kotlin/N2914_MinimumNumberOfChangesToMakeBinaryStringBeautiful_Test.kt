import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2914_MinimumNumberOfChangesToMakeBinaryStringBeautiful_Test {

    @Test
    fun minChanges_Test1() {
        assertThat(N2914_MinimumNumberOfChangesToMakeBinaryStringBeautiful().minChanges("1001")).isEqualTo(2)
    }

    @Test
    fun minChanges_Test2() {
        assertThat(N2914_MinimumNumberOfChangesToMakeBinaryStringBeautiful().minChanges("10")).isEqualTo(1)
    }

    @Test
    fun minChanges_Test3() {
        assertThat(N2914_MinimumNumberOfChangesToMakeBinaryStringBeautiful().minChanges("0000")).isEqualTo(0)
    }

    @Test
    fun minChanges_Test4() {
        assertThat(N2914_MinimumNumberOfChangesToMakeBinaryStringBeautiful().minChanges("00110111")).isEqualTo(1)
    }

    @Test
    fun minChanges_Test5() {
        assertThat(N2914_MinimumNumberOfChangesToMakeBinaryStringBeautiful().minChanges("01110111")).isEqualTo(2)
    }

    @Test
    fun minChanges_Test6() {
        assertThat(N2914_MinimumNumberOfChangesToMakeBinaryStringBeautiful().minChanges("01010000011001001101"))
            .isEqualTo(6)
    }
}