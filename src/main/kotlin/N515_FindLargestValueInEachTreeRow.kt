import java.util.LinkedList

class N515_FindLargestValueInEachTreeRow {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun largestValues(root: TreeNode?): List<Int> {
        val result = LinkedList<Int>()
        val queue = LinkedList<TreeNode>()
        if (root != null) queue.offer(root)
        while (queue.isNotEmpty()) {
            var currSize = queue.size
            var max = Int.MIN_VALUE
            while (--currSize > -1) {
                val currNode = queue.poll()
                if (max < currNode.`val`) max = currNode.`val`
                if (currNode.left != null) queue.offer(currNode.left)
                if (currNode.right != null) queue.offer(currNode.right)
            }
            result.add(max)
        }
        return result
    }
}