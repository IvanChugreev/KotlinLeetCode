import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1262_GreatestSumDivisibleByThree_Test {

    @Test
    fun maxSumDivThree_Test1() {
        assertThat(N1262_GreatestSumDivisibleByThree().maxSumDivThree(intArrayOf(3, 6, 5, 1, 8))).isEqualTo(18)
    }

    @Test
    fun maxSumDivThree_Test2() {
        assertThat(N1262_GreatestSumDivisibleByThree().maxSumDivThree(intArrayOf(4))).isEqualTo(0)
    }

    @Test
    fun maxSumDivThree_Test3() {
        assertThat(N1262_GreatestSumDivisibleByThree().maxSumDivThree(intArrayOf(1, 2, 3, 4, 4))).isEqualTo(12)
    }

}