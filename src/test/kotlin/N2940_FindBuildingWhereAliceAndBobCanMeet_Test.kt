import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2940_FindBuildingWhereAliceAndBobCanMeet_Test {

    @Test
    fun leftmostBuildingQueries_Test1() {
        val heights = intArrayOf(6, 4, 8, 5, 2, 7)
        val queries = arrayOf(intArrayOf(0, 1), intArrayOf(0, 3), intArrayOf(2, 4), intArrayOf(3, 4), intArrayOf(2, 2))
        assertThat(N2940_FindBuildingWhereAliceAndBobCanMeet().leftmostBuildingQueries(heights, queries))
            .containsExactly(2, 5, -1, 5, 2)
    }

    @Test
    fun leftmostBuildingQueries_Test2() {
        val heights = intArrayOf(5, 3, 8, 2, 6, 1, 4, 6)
        val queries = arrayOf(intArrayOf(0, 7), intArrayOf(3, 5), intArrayOf(5, 2), intArrayOf(3, 0), intArrayOf(1, 6))
        assertThat(N2940_FindBuildingWhereAliceAndBobCanMeet().leftmostBuildingQueries(heights, queries))
            .containsExactly(7, 6, -1, 4, 6)
    }
}