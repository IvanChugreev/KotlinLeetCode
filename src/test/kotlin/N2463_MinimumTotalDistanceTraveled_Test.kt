import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2463_MinimumTotalDistanceTraveled_Test {

    @Test
    fun minimumTotalDistance_Test1() {
        val robots = listOf(0, 4, 6)
        val factories = arrayOf(intArrayOf(2, 2), intArrayOf(6, 2))
        assertThat(N2463_MinimumTotalDistanceTraveled().minimumTotalDistance(robots, factories)).isEqualTo(4)
    }

    @Test
    fun minimumTotalDistance_Test2() {
        val robots = listOf(1, -1)
        val factories = arrayOf(intArrayOf(-2, 1), intArrayOf(2, 1))
        assertThat(N2463_MinimumTotalDistanceTraveled().minimumTotalDistance(robots, factories)).isEqualTo(2)
    }
}