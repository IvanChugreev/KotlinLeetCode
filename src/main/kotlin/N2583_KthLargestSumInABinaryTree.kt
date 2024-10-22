import java.util.LinkedList
import java.util.Queue

class N2583_KthLargestSumInABinaryTree {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null

        constructor(arr: Array<Int?>) : this(arr[0]!!) {
            val queue: Queue<TreeNode> = LinkedList()
            queue.add(this)
            var i = 1
            while (i < arr.size) {
                val size = queue.size
                var j = 0
                while (j++ < size) {
                    val curr = queue.poll()
                    if (i >= arr.size || arr[i] == null) break
                    curr.left = TreeNode(arr[i++]!!)
                    queue.add(curr.left)
                    if (i >= arr.size || arr[i] == null) break
                    curr.right = TreeNode(arr[i++]!!)
                    queue.add(curr.right)
                }
                if (i < arr.size && arr[i] == null) ++i
                repeat(size - j) { queue.poll() }
            }
        }
    }

    fun kthLargestLevelSum(root: TreeNode?, k: Int): Long {
        val sums = ArrayList<Long>()
        val bfsQueue: Queue<TreeNode> = LinkedList()
        bfsQueue.add(root)
        while (bfsQueue.isNotEmpty()) {
            var sum = 0L
            repeat(bfsQueue.size) {
                val currNode = bfsQueue.poll()
                if (currNode.left != null) bfsQueue.add(currNode.left)
                if (currNode.right != null) bfsQueue.add(currNode.right)
                sum += currNode.`val`
            }
            sums.add(sum)
        }
        fun partition(left: Int, right: Int): Int {
            val pivot = sums[right]
            var i = left
            var j = left
            while (j < right) {
                if (sums[j] > pivot) {
                    sums[i] = sums[j].also { sums[j] = sums[i] }
                    ++i
                }
                ++j
            }
            sums[right] = sums[i].also { sums[i] = sums[right] }
            return i
        }

        val kMinusOne = k - 1
        fun quickSelect(left: Int, right: Int): Long {
            if (left == right) return sums[left]
            val partition = partition(left, right)
            return if (kMinusOne < partition) quickSelect(left, partition - 1)
            else if (kMinusOne > partition) quickSelect(partition + 1, right)
            else sums[partition]
        }
        return if (k > sums.size) -1 else quickSelect(0, sums.lastIndex)
    }
}