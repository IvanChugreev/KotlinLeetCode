import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N11_ContainerWithMostWater_Test {

    @Test
    fun maxArea_Test1() {
        assertThat(N11_ContainerWithMostWater().maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))).isEqualTo(49)
    }

    @Test
    fun maxArea_Test2() {
        assertThat(N11_ContainerWithMostWater().maxArea(intArrayOf(1, 1))).isEqualTo(1)
    }
}