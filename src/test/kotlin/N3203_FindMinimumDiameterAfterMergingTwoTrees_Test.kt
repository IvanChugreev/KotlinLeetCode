import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3203_FindMinimumDiameterAfterMergingTwoTrees_Test {

    @Test
    fun minimumDiameterAfterMerge_Test1() {
        val edges1 = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3))
        val edges2 = arrayOf(intArrayOf(0, 1))
        assertThat(N3203_FindMinimumDiameterAfterMergingTwoTrees().minimumDiameterAfterMerge(edges1, edges2))
            .isEqualTo(3)
    }

    @Test
    fun minimumDiameterAfterMerge_Test2() {
        val edges1 = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(0, 3),
            intArrayOf(2, 4),
            intArrayOf(2, 5),
            intArrayOf(3, 6),
            intArrayOf(2, 7)
        )
        val edges2 = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(0, 3),
            intArrayOf(2, 4),
            intArrayOf(2, 5),
            intArrayOf(3, 6),
            intArrayOf(2, 7)
        )
        assertThat(N3203_FindMinimumDiameterAfterMergingTwoTrees().minimumDiameterAfterMerge(edges1, edges2))
            .isEqualTo(5)
    }
}