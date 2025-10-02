import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3100_WaterBottles2_Test {

    @Test
    fun maxBottlesDrunk_Test1() {
        assertThat(N3100_WaterBottles2().maxBottlesDrunk(13, 6)).isEqualTo(15)
    }

    @Test
    fun maxBottlesDrunk_Test2() {
        assertThat(N3100_WaterBottles2().maxBottlesDrunk(10, 3)).isEqualTo(13)
    }

}