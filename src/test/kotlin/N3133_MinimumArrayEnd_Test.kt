import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3133_MinimumArrayEnd_Test {

    @Test
    fun minEnd_Test1() {
        assertThat(N3133_MinimumArrayEnd().minEnd(3, 4)).isEqualTo(6)
    }

    @Test
    fun minEnd_Test2() {
        assertThat(N3133_MinimumArrayEnd().minEnd(2, 7)).isEqualTo(15)
    }

    @Test
    fun minEnd_Test3() {
        assertThat(N3133_MinimumArrayEnd().minEnd(11, 12)).isEqualTo(46)
    }
}