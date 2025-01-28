import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2658_MaximumNumberOfFishInAGrid_Test {

    @Test
    fun findMaxFish_Test1() {
        val grid = arrayOf(
            intArrayOf(0, 2, 1, 0),
            intArrayOf(4, 0, 0, 3),
            intArrayOf(1, 0, 0, 4),
            intArrayOf(0, 3, 2, 0)
        )
        assertThat(N2658_MaximumNumberOfFishInAGrid().findMaxFish(grid)).isEqualTo(7)
    }

    @Test
    fun findMaxFish_Test2() {
        val grid = arrayOf(
            intArrayOf(1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 1)
        )
        assertThat(N2658_MaximumNumberOfFishInAGrid().findMaxFish(grid)).isEqualTo(1)
    }

    @Test
    fun findMaxFish_Test3() {
        assertThat(N2658_MaximumNumberOfFishInAGrid().findMaxFish(arrayOf(intArrayOf(6, 1, 10)))).isEqualTo(17)
    }
}