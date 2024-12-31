import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N983_MinimumCostForTickets_Test {

    @Test
    fun mincostTickets_Test1() {
        val days = intArrayOf(1, 4, 6, 7, 8, 20)
        assertThat(N983_MinimumCostForTickets().mincostTickets(days, intArrayOf(2, 7, 15))).isEqualTo(11)
    }

    @Test
    fun mincostTickets_Test2() {
        val days = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31)
        assertThat(N983_MinimumCostForTickets().mincostTickets(days, intArrayOf(2, 7, 15))).isEqualTo(17)
    }
}