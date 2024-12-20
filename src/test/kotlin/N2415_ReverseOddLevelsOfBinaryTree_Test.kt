import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.LinkedList

class N2415_ReverseOddLevelsOfBinaryTree_Test {

    private fun IntArray.toTreeNode(): N2415_ReverseOddLevelsOfBinaryTree.TreeNode {
        val root = N2415_ReverseOddLevelsOfBinaryTree.TreeNode(this[0])
        val query = LinkedList<N2415_ReverseOddLevelsOfBinaryTree.TreeNode>()
        query.offer(root)
        (2..lastIndex step 2).forEach {
            val node = query.poll()
            node.left = N2415_ReverseOddLevelsOfBinaryTree.TreeNode(this[it - 1])
            node.right = N2415_ReverseOddLevelsOfBinaryTree.TreeNode(this[it])
            query.offer(node.left)
            query.offer(node.right)
        }
        return root
    }

    private fun N2415_ReverseOddLevelsOfBinaryTree.TreeNode.toIterable(): Iterable<Int> {
        val query = LinkedList<N2415_ReverseOddLevelsOfBinaryTree.TreeNode>()
        val result = LinkedList<Int>()
        query.offer(this)
        while (query.isNotEmpty()) {
            val node = query.poll()
            result.add(node.`val`)
            if (node.left != null) query.offer(node.left)
            if (node.right != null) query.offer(node.right)
        }
        return result
    }

    @Test
    fun reverseOddLevels_Test1() {
        val root = intArrayOf(2, 3, 5, 8, 13, 21, 34).toTreeNode()
        assertThat(N2415_ReverseOddLevelsOfBinaryTree().reverseOddLevels(root)!!.toIterable())
            .containsExactly(2, 5, 3, 8, 13, 21, 34)
    }

    @Test
    fun reverseOddLevels_Test2() {
        val root = intArrayOf(7, 13, 11).toTreeNode()
        assertThat(N2415_ReverseOddLevelsOfBinaryTree().reverseOddLevels(root)!!.toIterable())
            .containsExactly(7, 11, 13)
    }

    @Test
    fun reverseOddLevels_Test3() {
        val root = intArrayOf(0, 1, 2, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2).toTreeNode()
        assertThat(N2415_ReverseOddLevelsOfBinaryTree().reverseOddLevels(root)!!.toIterable())
            .containsExactly(0, 2, 1, 0, 0, 0, 0, 2, 2, 2, 2, 1, 1, 1, 1)
    }
}