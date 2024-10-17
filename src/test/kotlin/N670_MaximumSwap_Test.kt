import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N670_MaximumSwap_Test {

    @Test
    fun maximumSwap_Test1() {
        assertThat(N670_MaximumSwap().maximumSwap(2736)).isEqualTo(7236)
    }

    @Test
    fun maximumSwap_Test2() {
        assertThat(N670_MaximumSwap().maximumSwap(9973)).isEqualTo(9973)
    }

    @Test
    fun maximumSwap_Test3() {
        assertThat(N670_MaximumSwap().maximumSwap(99739812)).isEqualTo(99937812)
    }

    @Test
    fun maximumSwap_Test4() {
        assertThat(N670_MaximumSwap().maximumSwap(0)).isEqualTo(0)
    }

    @Test
    fun maximumSwap_Test5() {
        assertThat(N670_MaximumSwap().maximumSwap(98368)).isEqualTo(98863)
    }
}