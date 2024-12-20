class N2415_ReverseOddLevelsOfBinaryTree {

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun reverseOddLevels(root: TreeNode?): TreeNode? {
        fun dfs(left: TreeNode?, right: TreeNode?, depth: Int) {
            if (left == null || right == null) return
            if (depth and 1 == 1) left.`val` = right.`val`.also { right.`val` = left.`val` }
            dfs(left.left, right.right, depth + 1)
            dfs(left.right, right.left, depth + 1)
        }
        dfs(root!!.left, root.right, 1)
        return root
    }
}