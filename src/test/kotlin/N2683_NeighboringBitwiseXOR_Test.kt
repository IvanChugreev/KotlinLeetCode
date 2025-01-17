import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class N2683_NeighboringBitwiseXOR_Test {

    @Test
    fun doesValidArrayExist_Test1() {
        assertThat(N2683_NeighboringBitwiseXOR().doesValidArrayExist(intArrayOf(1, 1, 0))).isTrue()
    }

    @Test
    fun doesValidArrayExist_Test2() {
        assertThat(N2683_NeighboringBitwiseXOR().doesValidArrayExist(intArrayOf(1, 1))).isTrue()
    }

    @Test
    fun doesValidArrayExist_Test3() {
        assertThat(N2683_NeighboringBitwiseXOR().doesValidArrayExist(intArrayOf(1, 0))).isFalse()
    }
}