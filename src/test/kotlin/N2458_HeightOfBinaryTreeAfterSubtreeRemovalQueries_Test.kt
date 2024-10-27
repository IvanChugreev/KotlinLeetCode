import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2458_HeightOfBinaryTreeAfterSubtreeRemovalQueries_Test {

    @Test
    fun treeQueries_Test1() {
        val root = N2458_HeightOfBinaryTreeAfterSubtreeRemovalQueries
            .TreeNode(arrayOf(1, 3, 4, 2, null, 6, 5, null, null, null, null, null, 7))
        assertThat(N2458_HeightOfBinaryTreeAfterSubtreeRemovalQueries().treeQueries(root, intArrayOf(4)))
            .containsExactly(2)
    }

    @Test
    fun treeQueries_Test2() {
        val root = N2458_HeightOfBinaryTreeAfterSubtreeRemovalQueries.TreeNode(arrayOf(5, 8, 9, 2, 1, 3, 7, 4, 6))
        assertThat(N2458_HeightOfBinaryTreeAfterSubtreeRemovalQueries().treeQueries(root, intArrayOf(3, 2, 4, 8)))
            .containsExactly(3, 2, 3, 2)
    }
}