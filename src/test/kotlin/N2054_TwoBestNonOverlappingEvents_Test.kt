import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2054_TwoBestNonOverlappingEvents_Test {

    @Test
    fun maxTwoEvents_Test1() {
        val events = arrayOf(intArrayOf(1, 3, 2), intArrayOf(4, 5, 2), intArrayOf(2, 4, 3))
        assertThat(N2054_TwoBestNonOverlappingEvents().maxTwoEvents(events)).isEqualTo(4)
    }

    @Test
    fun maxTwoEvents_Test2() {
        val events = arrayOf(intArrayOf(1, 3, 2), intArrayOf(4, 5, 2), intArrayOf(1, 5, 5))
        assertThat(N2054_TwoBestNonOverlappingEvents().maxTwoEvents(events)).isEqualTo(5)
    }

    @Test
    fun maxTwoEvents_Test3() {
        val events = arrayOf(intArrayOf(1, 5, 3), intArrayOf(1, 5, 1), intArrayOf(6, 6, 5))
        assertThat(N2054_TwoBestNonOverlappingEvents().maxTwoEvents(events)).isEqualTo(8)
    }
}