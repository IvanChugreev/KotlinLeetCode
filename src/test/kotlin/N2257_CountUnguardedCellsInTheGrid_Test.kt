import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2257_CountUnguardedCellsInTheGrid_Test {

    @Test
    fun countUnguarded_Test1() {
        val guards = arrayOf(intArrayOf(0, 0), intArrayOf(1, 1), intArrayOf(2, 3))
        val walls = arrayOf(intArrayOf(0, 1), intArrayOf(2, 2), intArrayOf(1, 4))
        assertThat(N2257_CountUnguardedCellsInTheGrid().countUnguarded(4, 6, guards, walls)).isEqualTo(7)
    }

    @Test
    fun countUnguarded_Test2() {
        val guards = arrayOf(intArrayOf(1, 1))
        val walls = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(2, 1), intArrayOf(1, 2))
        assertThat(N2257_CountUnguardedCellsInTheGrid().countUnguarded(3, 3, guards, walls)).isEqualTo(4)
    }
}