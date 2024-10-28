import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2501_LongestSquareStreakInAnArray_Test {

    @Test
    fun longestSquareStreak_Test1() {
        assertThat(N2501_LongestSquareStreakInAnArray().longestSquareStreak(intArrayOf(4, 3, 6, 16, 8, 2))).isEqualTo(3)
    }

    @Test
    fun longestSquareStreak_Test2() {
        assertThat(N2501_LongestSquareStreakInAnArray().longestSquareStreak(intArrayOf(2, 3, 5, 6, 7))).isEqualTo(-1)
    }
}