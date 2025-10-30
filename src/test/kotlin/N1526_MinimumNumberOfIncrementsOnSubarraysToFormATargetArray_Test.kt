import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1526_MinimumNumberOfIncrementsOnSubarraysToFormATargetArray_Test {

    @Test
    fun minNumberOperations_Test1() {
        val target = intArrayOf(1, 2, 3, 2, 1)
        assertThat(N1526_MinimumNumberOfIncrementsOnSubarraysToFormATargetArray().minNumberOperations(target))
            .isEqualTo(3)
    }

    @Test
    fun minNumberOperations_Test2() {
        val target = intArrayOf(3, 1, 1, 2)
        assertThat(N1526_MinimumNumberOfIncrementsOnSubarraysToFormATargetArray().minNumberOperations(target))
            .isEqualTo(4)
    }

    @Test
    fun minNumberOperations_Test3() {
        val target = intArrayOf(3, 1, 5, 4, 2)
        assertThat(N1526_MinimumNumberOfIncrementsOnSubarraysToFormATargetArray().minNumberOperations(target))
            .isEqualTo(7)
    }
}