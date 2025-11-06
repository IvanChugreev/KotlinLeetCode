import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3607_PowerGridMaintenance_Test {

    @Test
    fun processQueries_Test1() {
        val connections = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 5))
        val queries = arrayOf(intArrayOf(1, 3), intArrayOf(2, 1), intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(1, 2))
        assertThat(N3607_PowerGridMaintenance().processQueries(5, connections, queries)).containsExactly(3, 2, 3)
    }

    @Test
    fun processQueries_Test2() {
        val queries = arrayOf(intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(1, 1))
        assertThat(N3607_PowerGridMaintenance().processQueries(3, arrayOf(), queries)).containsExactly(1, -1)
    }

}