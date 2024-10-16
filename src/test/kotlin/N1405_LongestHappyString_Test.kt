import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1405_LongestHappyString_Test {

    @Test
    fun longestDiverseString_Test1() {
        assertThat(N1405_LongestHappyString().longestDiverseString(1, 1, 7).length).isEqualTo(8)
    }

    @Test
    fun longestDiverseString_Test2() {
        assertThat(N1405_LongestHappyString().longestDiverseString(7, 1, 0).length).isEqualTo(5)
    }

    @Test
    fun longestDiverseString_Test3() {
        assertThat(N1405_LongestHappyString().longestDiverseString(8, 5, 7).length).isEqualTo(20)
    }

    @Test
    fun longestDiverseString_Test4() {
        assertThat(N1405_LongestHappyString().longestDiverseString(8, 0, 5).length).isEqualTo(13)
    }
}