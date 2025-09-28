import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N976_LargestPerimeterTriangle_Test {

    @Test
    fun largestPerimeter_Test1() {
        assertThat(N976_LargestPerimeterTriangle().largestPerimeter(intArrayOf(2, 1, 2))).isEqualTo(5)
    }

    @Test
    fun largestPerimeter_Test2() {
        assertThat(N976_LargestPerimeterTriangle().largestPerimeter(intArrayOf(1, 2, 1, 10))).isEqualTo(0)
    }

}