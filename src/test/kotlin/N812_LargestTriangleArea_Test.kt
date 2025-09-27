import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N812_LargestTriangleArea_Test {

    @Test
    fun largestTriangleArea_Test1() {
        val points = arrayOf(intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, 2), intArrayOf(2, 0))
        assertThat(N812_LargestTriangleArea().largestTriangleArea(points)).isEqualTo(2.0)
    }

    @Test
    fun largestTriangleArea_Test2() {
        val points = arrayOf(intArrayOf(1, 0), intArrayOf(0, 0), intArrayOf(0, 1))
        assertThat(N812_LargestTriangleArea().largestTriangleArea(points)).isEqualTo(0.5)
    }

}