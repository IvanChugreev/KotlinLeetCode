import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N773_SlidingPuzzle_Test {

    @Test
    fun slidingPuzzle_Test1() {
        assertThat(N773_SlidingPuzzle().slidingPuzzle(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 0, 5)))).isEqualTo(1)
    }

    @Test
    fun slidingPuzzle_Test2() {
        assertThat(N773_SlidingPuzzle().slidingPuzzle(arrayOf(intArrayOf(1, 2, 3), intArrayOf(5, 4, 0)))).isEqualTo(-1)
    }

    @Test
    fun slidingPuzzle_Test3() {
        assertThat(N773_SlidingPuzzle().slidingPuzzle(arrayOf(intArrayOf(4, 1, 2), intArrayOf(5, 0, 3)))).isEqualTo(5)
    }
}