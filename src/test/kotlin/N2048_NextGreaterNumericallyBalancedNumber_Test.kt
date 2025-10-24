import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2048_NextGreaterNumericallyBalancedNumber_Test {

    @Test
    fun nextBeautifulNumber_Test1() {
        assertThat(N2048_NextGreaterNumericallyBalancedNumber().nextBeautifulNumber(1)).isEqualTo(22)
    }

    @Test
    fun nextBeautifulNumber_Test2() {
        assertThat(N2048_NextGreaterNumericallyBalancedNumber().nextBeautifulNumber(1000)).isEqualTo(1333)
    }

    @Test
    fun nextBeautifulNumber_Test3() {
        assertThat(N2048_NextGreaterNumericallyBalancedNumber().nextBeautifulNumber(3000)).isEqualTo(3133)
    }

}