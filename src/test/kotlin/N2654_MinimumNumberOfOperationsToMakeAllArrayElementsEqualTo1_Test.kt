import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2654_MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1_Test {

    @Test
    fun minOperations_Test1() {
        val nums = intArrayOf(2, 6, 3, 4)
        assertThat(N2654_MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1().minOperations(nums)).isEqualTo(4)
    }

    @Test
    fun minOperations_Test2() {
        val nums = intArrayOf(2, 10, 6, 14)
        assertThat(N2654_MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1().minOperations(nums)).isEqualTo(-1)
    }

}