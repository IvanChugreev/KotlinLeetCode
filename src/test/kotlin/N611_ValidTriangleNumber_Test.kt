import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N611_ValidTriangleNumber_Test {

    @Test
    fun triangleNumber_Test1() {
        assertThat(N611_ValidTriangleNumber().triangleNumber(intArrayOf(2, 2, 3, 4))).isEqualTo(3)
    }

    @Test
    fun triangleNumber_Test2() {
        assertThat(N611_ValidTriangleNumber().triangleNumber(intArrayOf(4, 2, 3, 4))).isEqualTo(4)
    }

}