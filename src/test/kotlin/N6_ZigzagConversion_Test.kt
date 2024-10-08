import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N6_ZigzagConversion_Test {

    @Test
    fun convert_Test1() {
        assertThat(N6_ZigzagConversion().convert("PAYPALISHIRING", 3)).isEqualTo("PAHNAPLSIIGYIR")
    }

    @Test
    fun convert_Test2() {
        assertThat(N6_ZigzagConversion().convert("PAYPALISHIRING", 4)).isEqualTo("PINALSIGYAHRPI")
    }

    @Test
    fun convert_Test3() {
        assertThat(N6_ZigzagConversion().convert("A", 1)).isEqualTo("A")
    }
}