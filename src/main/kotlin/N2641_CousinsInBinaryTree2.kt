import java.util.LinkedList
import java.util.Queue

class N2641_CousinsInBinaryTree2 {
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

        fun toArray(): Array<Int?> {
            val result = ArrayList<Int?>()
            val queue: Queue<TreeNode?> = LinkedList()
            queue.add(this)
            while (queue.isNotEmpty()) {
                val currNode = queue.poll()
                result.add(currNode?.`val`)
                if (currNode?.left != null || queue.lastOrNull() != null) queue.offer(currNode?.left)
                if (currNode?.right != null || queue.lastOrNull() != null) queue.offer(currNode?.right)
            }
            if (result.last() == null) result.removeLast()
            return result.toTypedArray()
        }
    }

    fun replaceValueInTree(root: TreeNode?): TreeNode? {
        val bfsQueue: Queue<TreeNode> = LinkedList()
        bfsQueue.offer(root)
        var prevSum = root!!.`val`
        while (bfsQueue.isNotEmpty()) {
            var currSum = 0
            repeat(bfsQueue.size) {
                val currNode = bfsQueue.poll()
                currNode.`val` = prevSum - currNode.`val`
                val siblingSum = (currNode.left?.`val` ?: 0) + (currNode.right?.`val` ?: 0)
                currSum += siblingSum
                if (currNode.left != null) {
                    currNode.left!!.`val` = siblingSum
                    bfsQueue.offer(currNode.left)
                }
                if (currNode.right != null) {
                    currNode.right!!.`val` = siblingSum
                    bfsQueue.offer(currNode.right)
                }
            }
            prevSum = currSum
        }
        return root
    }
}