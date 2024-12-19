import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N769_MaxChunksToMakeSorted_Test {

    @Test
    fun maxChunksToSorted_Test1() {
        assertThat(N769_MaxChunksToMakeSorted().maxChunksToSorted(intArrayOf(4, 3, 2, 1, 0))).isEqualTo(1)
    }

    @Test
    fun maxChunksToSorted_Test2() {
        assertThat(N769_MaxChunksToMakeSorted().maxChunksToSorted(intArrayOf(1, 0, 2, 3, 4))).isEqualTo(4)
    }
}