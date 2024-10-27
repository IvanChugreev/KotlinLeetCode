import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1277_CountSquareSubmatricesWithAllOnes_Test {

    @Test
    fun countSquares_Test1() {
        val matrix = arrayOf(intArrayOf(0, 1, 1, 1), intArrayOf(1, 1, 1, 1), intArrayOf(0, 1, 1, 1))
        assertThat(N1277_CountSquareSubmatricesWithAllOnes().countSquares(matrix)).isEqualTo(15)
    }

    @Test
    fun countSquares_Test2() {
        val matrix = arrayOf(intArrayOf(1, 0, 1), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0))
        assertThat(N1277_CountSquareSubmatricesWithAllOnes().countSquares(matrix)).isEqualTo(7)
    }
}