import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2275_LargestCombinationWithBitwiseANDGreaterThanZero_Test {

    @Test
    fun largestCombination_Test1() {
        val candidates = intArrayOf(16, 17, 71, 62, 12, 24, 14)
        assertThat(N2275_LargestCombinationWithBitwiseANDGreaterThanZero().largestCombination(candidates)).isEqualTo(4)
    }

    @Test
    fun largestCombination_Test2() {
        val candidates = intArrayOf(8, 8)
        assertThat(N2275_LargestCombinationWithBitwiseANDGreaterThanZero().largestCombination(candidates)).isEqualTo(2)
    }

    @Test
    fun largestCombination_Test3() {
        val candidates = intArrayOf(8)
        assertThat(N2275_LargestCombinationWithBitwiseANDGreaterThanZero().largestCombination(candidates)).isEqualTo(1)
    }

    @Test
    fun largestCombination_Test4() {
        val candidates = intArrayOf(1, 2, 4, 8)
        assertThat(N2275_LargestCombinationWithBitwiseANDGreaterThanZero().largestCombination(candidates)).isEqualTo(1)
    }
}