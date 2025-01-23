import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1267_CountServersThatCommunicate_Test {

    @Test
    fun countServers_Test1() {
        assertThat(N1267_CountServersThatCommunicate().countServers(arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))))
            .isEqualTo(0)
    }

    @Test
    fun countServers_Test2() {
        assertThat(N1267_CountServersThatCommunicate().countServers(arrayOf(intArrayOf(1, 0), intArrayOf(1, 1))))
            .isEqualTo(3)
    }

    @Test
    fun countServers_Test3() {
        val grid = arrayOf(
            intArrayOf(1, 1, 0, 0),
            intArrayOf(0, 0, 1, 0),
            intArrayOf(0, 0, 1, 0),
            intArrayOf(0, 0, 0, 1)
        )
        assertThat(N1267_CountServersThatCommunicate().countServers(grid))
            .isEqualTo(4)
    }
}