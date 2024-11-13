import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2563_CountTheNumberOfFairPairs_Test {

    @Test
    fun countFairPairs_Test1() {
        val nums = intArrayOf(0, 1, 7, 4, 4, 5)
        assertThat(N2563_CountTheNumberOfFairPairs().countFairPairs(nums, 3, 6)).isEqualTo(6)
    }

    @Test
    fun countFairPairs_Test2() {
        val nums = intArrayOf(1, 7, 9, 2, 5)
        assertThat(N2563_CountTheNumberOfFairPairs().countFairPairs(nums, 11, 11)).isEqualTo(1)
    }
}