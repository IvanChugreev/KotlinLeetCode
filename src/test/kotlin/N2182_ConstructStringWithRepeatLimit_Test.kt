import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2182_ConstructStringWithRepeatLimit_Test {

    @Test
    fun repeatLimitedString_Test1() {
        assertThat(N2182_ConstructStringWithRepeatLimit().repeatLimitedString("cczazcc", 3)).isEqualTo("zzcccac")
    }

    @Test
    fun repeatLimitedString_Test2() {
        assertThat(N2182_ConstructStringWithRepeatLimit().repeatLimitedString("aababab", 2)).isEqualTo("bbabaa")
    }
}