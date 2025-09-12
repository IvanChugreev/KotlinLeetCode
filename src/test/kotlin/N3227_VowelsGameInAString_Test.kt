import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3227_VowelsGameInAString_Test {

    @Test
    fun doesAliceWin_Test1() {
        assertThat(N3227_VowelsGameInAString().doesAliceWin("leetcoder")).isTrue
    }

    @Test
    fun doesAliceWin_Test2() {
        assertThat(N3227_VowelsGameInAString().doesAliceWin("bbcd")).isFalse
    }

}