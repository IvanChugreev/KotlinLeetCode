import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N757_SetIntersectionSizeAtLeastTwo_Test {

    @Test
    fun intersectionSizeTwo_Test1() {
        val intervals = arrayOf(intArrayOf(1, 3), intArrayOf(3, 7), intArrayOf(8, 9))
        assertThat(N757_SetIntersectionSizeAtLeastTwo().intersectionSizeTwo(intervals)).isEqualTo(5)
    }

    @Test
    fun intersectionSizeTwo_Test2() {
        val intervals = arrayOf(intArrayOf(1, 3), intArrayOf(1, 4), intArrayOf(2, 5), intArrayOf(3, 5))
        assertThat(N757_SetIntersectionSizeAtLeastTwo().intersectionSizeTwo(intervals)).isEqualTo(3)
    }

    @Test
    fun intersectionSizeTwo_Test3() {
        val intervals = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(2, 4), intArrayOf(4, 5))
        assertThat(N757_SetIntersectionSizeAtLeastTwo().intersectionSizeTwo(intervals)).isEqualTo(5)
    }

    @Test
    fun intersectionSizeTwo_Test4() {
        val intervals = arrayOf(
            intArrayOf(2, 10), intArrayOf(3, 7), intArrayOf(3, 15), intArrayOf(4, 11), intArrayOf(6, 12),
            intArrayOf(6, 16), intArrayOf(7, 8), intArrayOf(7, 11), intArrayOf(7, 15), intArrayOf(11, 12)
        )
        assertThat(N757_SetIntersectionSizeAtLeastTwo().intersectionSizeTwo(intervals)).isEqualTo(5)
    }

}