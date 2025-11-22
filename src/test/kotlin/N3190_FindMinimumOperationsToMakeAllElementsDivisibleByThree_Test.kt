import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3190_FindMinimumOperationsToMakeAllElementsDivisibleByThree_Test {

    @Test
    fun minimumOperations_Test1() {
        val nums = intArrayOf(1, 2, 3, 4)
        assertThat(N3190_FindMinimumOperationsToMakeAllElementsDivisibleByThree().minimumOperations(nums)).isEqualTo(3)
    }

    @Test
    fun minimumOperations_Test2() {
        val nums = intArrayOf(3, 6, 9)
        assertThat(N3190_FindMinimumOperationsToMakeAllElementsDivisibleByThree().minimumOperations(nums)).isEqualTo(0)
    }

}