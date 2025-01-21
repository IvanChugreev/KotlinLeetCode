import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2017_GridGame_Test {

    @Test
    fun gridGame_Test1() {
        assertThat(N2017_GridGame().gridGame(arrayOf(intArrayOf(2, 5, 4), intArrayOf(1, 5, 1)))).isEqualTo(4)
    }

    @Test
    fun gridGame_Test2() {
        assertThat(N2017_GridGame().gridGame(arrayOf(intArrayOf(3, 3, 1), intArrayOf(8, 5, 2)))).isEqualTo(4)
    }

    @Test
    fun gridGame_Test3() {
        assertThat(N2017_GridGame().gridGame(arrayOf(intArrayOf(1, 3, 1, 15), intArrayOf(1, 3, 3, 1)))).isEqualTo(7)
    }
}