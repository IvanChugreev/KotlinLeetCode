import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1518_WaterBottles_Test {

    @Test
    fun numWaterBottles_Test1() {
        assertThat(N1518_WaterBottles().numWaterBottles(9, 3)).isEqualTo(13)
    }

    @Test
    fun numWaterBottles_Test2() {
        assertThat(N1518_WaterBottles().numWaterBottles(15, 4)).isEqualTo(19)
    }

}