import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1368_MinimumCostToMakeAtLeastOneValidPathInAGrid_Test {

    @Test
    fun minCost_Test1() {
        val grid = arrayOf(
            intArrayOf(1, 1, 1, 1),
            intArrayOf(2, 2, 2, 2),
            intArrayOf(1, 1, 1, 1),
            intArrayOf(2, 2, 2, 2)
        )
        assertThat(N1368_MinimumCostToMakeAtLeastOneValidPathInAGrid().minCost(grid)).isEqualTo(3)
    }

    @Test
    fun minCost_Test2() {
        val grid = arrayOf(intArrayOf(1, 1, 3), intArrayOf(3, 2, 2), intArrayOf(1, 1, 4))
        assertThat(N1368_MinimumCostToMakeAtLeastOneValidPathInAGrid().minCost(grid)).isEqualTo(0)
    }

    @Test
    fun minCost_Test3() {
        val grid = arrayOf(intArrayOf(1, 2), intArrayOf(4, 3))
        assertThat(N1368_MinimumCostToMakeAtLeastOneValidPathInAGrid().minCost(grid)).isEqualTo(1)
    }
}