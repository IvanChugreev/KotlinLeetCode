import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2290_MinimumObstacleRemovalToReachCorner_Test {

    @Test
    fun minimumObstacles_Test1() {
        val grid = arrayOf(intArrayOf(0, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0))
        assertThat(N2290_MinimumObstacleRemovalToReachCorner().minimumObstacles(grid)).isEqualTo(2)
    }

    @Test
    fun minimumObstacles_Test2() {
        val grid = arrayOf(intArrayOf(0, 1, 0, 0, 0), intArrayOf(0, 1, 0, 1, 0), intArrayOf(0, 0, 0, 1, 0))
        assertThat(N2290_MinimumObstacleRemovalToReachCorner().minimumObstacles(grid)).isEqualTo(0)
    }

    @Test
    fun minimumObstacles_Test3() {
        val grid = arrayOf(intArrayOf(0, 1, 0, 0, 0), intArrayOf(0, 1, 0, 1, 0), intArrayOf(0, 0, 0, 1, 0))
        assertThat(N2290_MinimumObstacleRemovalToReachCorner().minimumObstacles(grid)).isEqualTo(0)
    }

    @Test
    fun minimumObstacles_Test4() {
        val grid = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(1, 1, 0),
            intArrayOf(1, 1, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 1, 1),
            intArrayOf(0, 1, 1),
            intArrayOf(0, 0, 0)
        )
        assertThat(N2290_MinimumObstacleRemovalToReachCorner().minimumObstacles(grid)).isEqualTo(1)
    }

    @Test
    fun minimumObstacles_Test5() {
        val grid = arrayOf(
            intArrayOf(0, 0, 0, 0),
            intArrayOf(1, 1, 0, 1),
            intArrayOf(0, 0, 1, 0),
            intArrayOf(1, 0, 0, 0)
        )
        assertThat(N2290_MinimumObstacleRemovalToReachCorner().minimumObstacles(grid)).isEqualTo(1)
    }
}