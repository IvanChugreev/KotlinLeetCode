import java.util.LinkedList
import java.util.Queue

class N2458_HeightOfBinaryTreeAfterSubtreeRemovalQueries {

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

    fun treeQueries(root: TreeNode?, queries: IntArray): IntArray {
        val maxHeightAfterRemoval = HashMap<Int, Int>((queries.size shl 2) / 3 + 2)
        queries.forEach { maxHeightAfterRemoval[it] = 0 }
        var currentMaxHeight = 0
        fun traverseLeftToRight(node: TreeNode?, currentHeight: Int) {
            if (node == null) return
            maxHeightAfterRemoval.computeIfPresent(node.`val`) { _, _ -> currentMaxHeight }
            if (currentHeight > currentMaxHeight) currentMaxHeight = currentHeight
            traverseLeftToRight(node.left, currentHeight + 1)
            traverseLeftToRight(node.right, currentHeight + 1)
        }

        fun traverseRightToLeft(node: TreeNode?, currentHeight: Int) {
            if (node == null) return
            maxHeightAfterRemoval.computeIfPresent(node.`val`) { _, oldValue -> maxOf(oldValue, currentMaxHeight) }
            if (currentHeight > currentMaxHeight) currentMaxHeight = currentHeight
            traverseRightToLeft(node.right, currentHeight + 1)
            traverseRightToLeft(node.left, currentHeight + 1)
        }
        traverseLeftToRight(root, 0)
        currentMaxHeight = 0
        traverseRightToLeft(root, 0)
        val queryResults = IntArray(queries.size)
        queries.forEachIndexed { ind, value -> queryResults[ind] = maxHeightAfterRemoval[value]!! }
        return queryResults
    }
}