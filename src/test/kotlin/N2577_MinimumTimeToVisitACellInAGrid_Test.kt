import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2577_MinimumTimeToVisitACellInAGrid_Test {

    @Test
    fun minimumTime_Test1() {
        val grid = arrayOf(intArrayOf(0, 1, 3, 2), intArrayOf(5, 1, 2, 5), intArrayOf(4, 3, 8, 6))
        assertThat(N2577_MinimumTimeToVisitACellInAGrid().minimumTime(grid)).isEqualTo(7)
    }

    @Test
    fun minimumTime_Test2() {
        val grid = arrayOf(intArrayOf(0, 2, 4), intArrayOf(3, 2, 1), intArrayOf(1, 0, 4))
        assertThat(N2577_MinimumTimeToVisitACellInAGrid().minimumTime(grid)).isEqualTo(-1)
    }

    @Test
    fun minimumTime_Test3() {
        val grid = arrayOf(
            intArrayOf(0, 1, 4, 3),
            intArrayOf(6, 10, 6, 6),
            intArrayOf(2, 2, 6, 5),
            intArrayOf(4, 9, 7, 11)
        )
        assertThat(N2577_MinimumTimeToVisitACellInAGrid().minimumTime(grid)).isEqualTo(12)
    }
}