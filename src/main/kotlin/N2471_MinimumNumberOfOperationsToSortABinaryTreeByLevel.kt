import java.util.LinkedList

class N2471_MinimumNumberOfOperationsToSortABinaryTreeByLevel {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun minimumOperations(root: TreeNode?): Int {
        val shift = 20
        val mask = 0xFFFFFL
        val queue = LinkedList<TreeNode>()
        queue.add(root!!)
        var swaps = 0
        while (!queue.isEmpty()) {
            val levelSize = queue.size
            val nodes = LongArray(levelSize)
            nodes.indices.forEach {
                val node = queue.poll()
                nodes[it] = (node.`val`.toLong() shl shift) + it
                if (node.left != null) queue.offer(node.left)
                if (node.right != null) queue.offer(node.right)
            }
            nodes.sort()
            var i = 0
            while (i < levelSize) {
                val origPos = (nodes[i] and mask).toInt()
                if (origPos != i) {
                    nodes[i] = nodes[origPos].also { nodes[origPos] = nodes[i--] }
                    ++swaps
                }
                ++i
            }
        }
        return swaps
    }
}