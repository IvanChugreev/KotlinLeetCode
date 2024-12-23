import N2471_MinimumNumberOfOperationsToSortABinaryTreeByLevel.TreeNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.LinkedList

class N2471_MinimumNumberOfOperationsToSortABinaryTreeByLevel_Test {
    private fun Array<Int?>.toTreeNode(): TreeNode {
        val root = TreeNode(this[0]!!)
        val query = LinkedList<TreeNode>()
        query.offer(root)
        (2..lastIndex step 2).forEach {
            val node = query.poll()
            if (this[it - 1] != null) {
                node.left = TreeNode(this[it - 1]!!)
                query.offer(node.left)
            }
            if (this[it] != null) {
                node.right = TreeNode(this[it]!!)
                query.offer(node.right)
            }
        }
        if (size and 1 == 0) query.poll().left = TreeNode(this[lastIndex]!!)
        return root
    }

    @Test
    fun minimumOperations_Test1() {
        val root = arrayOf(1, 4, 3, 7, 6, 8, 5, null, null, null, null, 9, null, 10).toTreeNode()
        assertThat(N2471_MinimumNumberOfOperationsToSortABinaryTreeByLevel().minimumOperations(root)).isEqualTo(3)
    }

    @Test
    fun minimumOperations_Test2() {
        val root = arrayOf<Int?>(1, 3, 2, 7, 6, 5, 4).toTreeNode()
        assertThat(N2471_MinimumNumberOfOperationsToSortABinaryTreeByLevel().minimumOperations(root)).isEqualTo(3)
    }

    @Test
    fun minimumOperations_Test3() {
        val root = arrayOf<Int?>(1, 2, 3, 4, 5, 6).toTreeNode()
        assertThat(N2471_MinimumNumberOfOperationsToSortABinaryTreeByLevel().minimumOperations(root)).isEqualTo(0)
    }
}