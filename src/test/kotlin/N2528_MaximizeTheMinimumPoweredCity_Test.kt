import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2528_MaximizeTheMinimumPoweredCity_Test {

    @Test
    fun maxPower_Test1() {
        assertThat(N2528_MaximizeTheMinimumPoweredCity().maxPower(intArrayOf(1, 2, 4, 5, 0), 1, 2)).isEqualTo(5)
    }

    @Test
    fun maxPower_Test2() {
        assertThat(N2528_MaximizeTheMinimumPoweredCity().maxPower(intArrayOf(4, 4, 4, 4), 0, 3)).isEqualTo(4)
    }

}