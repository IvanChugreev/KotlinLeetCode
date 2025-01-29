import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N684_RedundantConnection_Test {

    @Test
    fun findRedundantConnection_Test1() {
        val edges = arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 3))
        assertThat(N684_RedundantConnection().findRedundantConnection(edges)).containsExactly(2, 3)
    }

    @Test
    fun findRedundantConnection_Test2() {
        val edges = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(1, 4), intArrayOf(1, 5))
        assertThat(N684_RedundantConnection().findRedundantConnection(edges)).containsExactly(1, 4)
    }
}