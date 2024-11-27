import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3243_ShortestDistanceAfterRoadAdditionQueries_Test {

    @Test
    fun shortestDistanceAfterQueries_Test1() {
        val queries = arrayOf(intArrayOf(2, 4), intArrayOf(0, 2), intArrayOf(0, 4))
        assertThat(N3243_ShortestDistanceAfterRoadAdditionQueries().shortestDistanceAfterQueries(5, queries))
            .containsExactly(3, 2, 1)
    }

    @Test
    fun shortestDistanceAfterQueries_Test2() {
        val queries = arrayOf(intArrayOf(0, 3), intArrayOf(0, 2))
        assertThat(N3243_ShortestDistanceAfterRoadAdditionQueries().shortestDistanceAfterQueries(4, queries))
            .containsExactly(1, 1)
    }

    @Test
    fun shortestDistanceAfterQueries_Test3() {
        val queries = arrayOf(intArrayOf(0, 2), intArrayOf(0, 4))
        assertThat(N3243_ShortestDistanceAfterRoadAdditionQueries().shortestDistanceAfterQueries(5, queries))
            .containsExactly(3, 1)
    }
}