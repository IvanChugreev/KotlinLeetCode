import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1716_CalculateMoneyInLeetcodeBank_Test {

    @Test
    fun totalMoney_Test1() {
        assertThat(N1716_CalculateMoneyInLeetcodeBank().totalMoney(4)).isEqualTo(10)
    }

    @Test
    fun totalMoney_Test2() {
        assertThat(N1716_CalculateMoneyInLeetcodeBank().totalMoney(10)).isEqualTo(37)
    }

    @Test
    fun totalMoney_Test3() {
        assertThat(N1716_CalculateMoneyInLeetcodeBank().totalMoney(20)).isEqualTo(96)
    }

}