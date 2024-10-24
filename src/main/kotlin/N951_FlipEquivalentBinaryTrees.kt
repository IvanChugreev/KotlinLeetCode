import java.util.LinkedList
import java.util.Queue

class N951_FlipEquivalentBinaryTrees {
    fun flipEquiv(root1: TreeNode?, root2: TreeNode?): Boolean {
        if (root1 == null || root2 == null) return root1 == root2
        val queue1: Queue<TreeNode> = LinkedList()
        val queue2: Queue<TreeNode> = LinkedList()
        queue1.add(root1)
        queue2.add(root2)
        while (queue1.isNotEmpty()) {
            if (queue1.size != queue2.size) return false
            val node1 = queue1.poll()
            val node2 = queue2.poll()
            if (node1.`val` != node2.`val`) return false
            val left1 = node1.left?.`val`
            val left2 = node2.left?.`val`
            val right1 = node1.right?.`val`
            val right2 = node2.right?.`val`
            if (left1 == right2 && right1 == left2) node1.right = node1.left.also { node1.left = node1.right }
            node1.left?.let { queue1.add(it) }
            node2.left?.let { queue2.add(it) }
            node1.right?.let { queue1.add(it) }
            node2.right?.let { queue2.add(it) }
        }
        return true
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null

        constructor(arr: Array<Int?>) : this(arr[0]!!) {
            val queue: Queue<TreeNode> = LinkedList()
            queue.add(this)
            var i = 1
            while (true) {
                val currNode = queue.poll()
                if (i < arr.size) {
                    if (arr[i] != null) {
                        currNode.left = TreeNode(arr[i]!!)
                        queue.offer(currNode.left)
                    }
                    ++i
                } else break
                if (i < arr.size) {
                    if (arr[i] != null) {
                        currNode.right = TreeNode(arr[i]!!)
                        queue.offer(currNode.right)
                    }
                    ++i
                } else break
            }
        }
    }
}