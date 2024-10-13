import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2406_DivideIntervalsIntoMinimumNumberOfGroups_Test {

    @Test
    fun minGroups_Test1() {
        val intervals = arrayOf(intArrayOf(5,10), intArrayOf(6,8), intArrayOf(1,5), intArrayOf(2,3), intArrayOf(1,10))
        assertThat(N2406_DivideIntervalsIntoMinimumNumberOfGroups().minGroups(intervals)).isEqualTo(3)
    }

    @Test
    fun minGroups_Test2() {
        val intervals = arrayOf(intArrayOf(1,3), intArrayOf(5,6), intArrayOf(8,10), intArrayOf(11,13))
        assertThat(N2406_DivideIntervalsIntoMinimumNumberOfGroups().minGroups(intervals)).isEqualTo(1)
    }
}