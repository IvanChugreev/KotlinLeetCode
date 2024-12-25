import N515_FindLargestValueInEachTreeRow.TreeNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.LinkedList

class N515_FindLargestValueInEachTreeRow_Test {

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
    fun largestValues_Test1() {
        val root = arrayOf(1, 3, 2, 5, 3, null, 9).toTreeNode()
        assertThat(N515_FindLargestValueInEachTreeRow().largestValues(root)).containsExactly(1, 3, 9)
    }

    @Test
    fun largestValues_Test2() {
        val root = arrayOf<Int?>(1, 2, 3).toTreeNode()
        assertThat(N515_FindLargestValueInEachTreeRow().largestValues(root)).containsExactly(1, 3)
    }
}