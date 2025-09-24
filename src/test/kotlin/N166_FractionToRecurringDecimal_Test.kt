import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N166_FractionToRecurringDecimal_Test {

    @Test
    fun fractionToDecimal_Test1() {
        assertThat(N166_FractionToRecurringDecimal().fractionToDecimal(1, 2)).isEqualTo("0.5")
    }

    @Test
    fun fractionToDecimal_Test2() {
        assertThat(N166_FractionToRecurringDecimal().fractionToDecimal(2, 1)).isEqualTo("2")
    }

    @Test
    fun fractionToDecimal_Test3() {
        assertThat(N166_FractionToRecurringDecimal().fractionToDecimal(4, 333)).isEqualTo("0.(012)")
    }

    @Test
    fun fractionToDecimal_Test4() {
        assertThat(N166_FractionToRecurringDecimal().fractionToDecimal(-1, -2147483648))
            .isEqualTo("0.0000000004656612873077392578125")
    }

}