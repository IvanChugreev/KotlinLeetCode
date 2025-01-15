import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2429_MinimizeXOR_Test {

    @Test
    fun minimizeXor_Test1() {
        assertThat(N2429_MinimizeXOR().minimizeXor(3, 5)).isEqualTo(3)
    }

    @Test
    fun minimizeXor_Test2() {
        assertThat(N2429_MinimizeXOR().minimizeXor(1, 12)).isEqualTo(3)
    }
}