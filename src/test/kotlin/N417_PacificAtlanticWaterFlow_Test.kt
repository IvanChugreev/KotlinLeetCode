import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N417_PacificAtlanticWaterFlow_Test {

    @Test
    fun pacificAtlantic_Test1() {
        val heights = arrayOf(
            intArrayOf(1, 2, 2, 3, 5),
            intArrayOf(3, 2, 3, 4, 4),
            intArrayOf(2, 4, 5, 3, 1),
            intArrayOf(6, 7, 1, 4, 5),
            intArrayOf(5, 1, 1, 2, 4)
        )
        assertThat(N417_PacificAtlanticWaterFlow().pacificAtlantic(heights)).containsExactly(
            listOf(0, 4), listOf(1, 3), listOf(1, 4), listOf(2, 2), listOf(3, 0), listOf(3, 1), listOf(4, 0)
        )
    }

    @Test
    fun pacificAtlantic_Test2() {
        assertThat(N417_PacificAtlanticWaterFlow().pacificAtlantic(arrayOf(intArrayOf(0))))
            .containsExactly(listOf(0, 0))
    }

    @Test
    fun pacificAtlantic_Test3() {
        val heights = arrayOf(intArrayOf(1, 2, 3), intArrayOf(8, 9, 4), intArrayOf(7, 6, 5))
        assertThat(N417_PacificAtlanticWaterFlow().pacificAtlantic(heights)).containsExactly(
            listOf(0, 2), listOf(1, 0), listOf(1, 1), listOf(1, 2), listOf(2, 0), listOf(2, 1), listOf(2, 2)
        )
    }

}