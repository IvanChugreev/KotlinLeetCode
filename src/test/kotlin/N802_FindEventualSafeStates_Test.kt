import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N802_FindEventualSafeStates_Test {

    @Test
    fun eventualSafeNodes_Test1() {
        val graph: Array<IntArray> = arrayOf(
            intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(5), intArrayOf(0), intArrayOf(5), intArrayOf(), intArrayOf()
        )
        assertThat(N802_FindEventualSafeStates().eventualSafeNodes(graph)).containsExactly(2, 4, 5, 6)
    }

    @Test
    fun eventualSafeNodes_Test2() {
        val graph: Array<IntArray> = arrayOf(
            intArrayOf(1, 2, 3, 4), intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(0, 4), intArrayOf()
        )
        assertThat(N802_FindEventualSafeStates().eventualSafeNodes(graph)).containsExactly(4)
    }
}