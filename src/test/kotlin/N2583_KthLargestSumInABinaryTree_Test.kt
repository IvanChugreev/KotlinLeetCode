import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2583_KthLargestSumInABinaryTree_Test {

    @Test
    fun kthLargestLevelSum_Test1() {
        val root = N2583_KthLargestSumInABinaryTree.TreeNode(arrayOf(5, 8, 9, 2, 1, 3, 7, 4, 6))
        assertThat(N2583_KthLargestSumInABinaryTree().kthLargestLevelSum(root, 2)).isEqualTo(13)
    }

    @Test
    fun kthLargestLevelSum_Test2() {
        val root = N2583_KthLargestSumInABinaryTree.TreeNode(arrayOf(1, 2, null, 3))
        assertThat(N2583_KthLargestSumInABinaryTree().kthLargestLevelSum(root, 1)).isEqualTo(3)
    }

    @Test
    fun kthLargestLevelSum_Test3() {
        val root = N2583_KthLargestSumInABinaryTree.TreeNode(arrayOf(411310, 211244, 111674))
        assertThat(N2583_KthLargestSumInABinaryTree().kthLargestLevelSum(root, 2)).isEqualTo(322918)
    }
}