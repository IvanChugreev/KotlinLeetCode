import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2641_CousinsInBinaryTree2_Test {

    @Test
    fun replaceValueInTree_Test1() {
        val root = N2641_CousinsInBinaryTree2.TreeNode(arrayOf(5, 4, 9, 1, 10, null, 7))
        assertThat(N2641_CousinsInBinaryTree2().replaceValueInTree(root)?.toArray())
            .containsExactly(0, 0, 0, 7, 7, null, 11)
    }

    @Test
    fun replaceValueInTree_Test2() {
        val root = N2641_CousinsInBinaryTree2.TreeNode(arrayOf(3, 1, 2))
        assertThat(N2641_CousinsInBinaryTree2().replaceValueInTree(root)?.toArray())
            .containsExactly(0, 0, 0)
    }
}