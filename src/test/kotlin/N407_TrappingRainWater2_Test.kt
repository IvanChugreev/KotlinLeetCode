import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N407_TrappingRainWater2_Test {

    @Test
    fun trapRainWater_Test1() {
        val heightMap = arrayOf(
            intArrayOf(1, 4, 3, 1, 3, 2),
            intArrayOf(3, 2, 1, 3, 2, 4),
            intArrayOf(2, 3, 3, 2, 3, 1)
        )
        assertThat(N407_TrappingRainWater2().trapRainWater(heightMap)).isEqualTo(4)
    }

    @Test
    fun trapRainWater_Test2() {
        val heightMap = arrayOf(
            intArrayOf(3, 3, 3, 3, 3),
            intArrayOf(3, 2, 2, 2, 3),
            intArrayOf(3, 2, 1, 2, 3),
            intArrayOf(3, 2, 2, 2, 3),
            intArrayOf(3, 3, 3, 3, 3)
        )
        assertThat(N407_TrappingRainWater2().trapRainWater(heightMap)).isEqualTo(10)
    }
}