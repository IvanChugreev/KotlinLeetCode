import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2381_ShiftingLetters2_Test {

    @Test
    fun shiftingLetters_Test1() {
        val shifts = arrayOf(intArrayOf(0, 1, 0), intArrayOf(1, 2, 1), intArrayOf(0, 2, 1))
        assertThat(N2381_ShiftingLetters2().shiftingLetters("abc", shifts)).isEqualTo("ace")
    }

    @Test
    fun shiftingLetters_Test2() {
        val shifts = arrayOf(intArrayOf(0, 0, 0), intArrayOf(1, 1, 1))
        assertThat(N2381_ShiftingLetters2().shiftingLetters("dztz", shifts)).isEqualTo("catz")
    }
}