import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N474_OnesAndZeroes_Test {

    @Test
    fun findMaxForm_Test1() {
        assertThat(N474_OnesAndZeroes().findMaxForm(arrayOf("10", "0001", "111001", "1", "0"), 5, 3)).isEqualTo(4)
    }

    @Test
    fun findMaxForm_Test2() {
        assertThat(N474_OnesAndZeroes().findMaxForm(arrayOf("10", "0", "1"), 1, 1)).isEqualTo(2)
    }

}