import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N951_FlipEquivalentBinaryTrees_Test {

    @Test
    fun flipEquiv_Test1() {
        val root1 = N951_FlipEquivalentBinaryTrees
            .TreeNode(arrayOf(1, 2, 3, 4, 5, 6, null, null, null, 7, 8))
        val root2 = N951_FlipEquivalentBinaryTrees
            .TreeNode(arrayOf(1, 3, 2, null, 6, 4, 5, null, null, null, null, 8, 7))
        assertThat(N951_FlipEquivalentBinaryTrees().flipEquiv(root1, root2)).isTrue()
    }

    @Test
    fun flipEquiv_Test2() {
        assertThat(N951_FlipEquivalentBinaryTrees().flipEquiv(null, null)).isTrue()
    }

    @Test
    fun flipEquiv_Test3() {
        val root2 = N951_FlipEquivalentBinaryTrees.TreeNode(1)
        assertThat(N951_FlipEquivalentBinaryTrees().flipEquiv(null, root2)).isFalse()
    }
}