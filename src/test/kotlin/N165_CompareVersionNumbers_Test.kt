import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N165_CompareVersionNumbers_Test {

    @Test
    fun compareVersion_Test1() {
        assertThat(N165_CompareVersionNumbers().compareVersion("1.2", "1.10")).isEqualTo(-1)
    }

    @Test
    fun compareVersion_Test2() {
        assertThat(N165_CompareVersionNumbers().compareVersion("1.01", "1.001")).isEqualTo(0)
    }

    @Test
    fun compareVersion_Test3() {
        assertThat(N165_CompareVersionNumbers().compareVersion("1.0", "1.0.0.0")).isEqualTo(0)
    }

}