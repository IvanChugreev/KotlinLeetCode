import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3397_MaximumNumberOfDistinctElementsAfterOperations_Test {

    @Test
    fun maxDistinctElements_Test1() {
        val nums = intArrayOf(1, 2, 2, 3, 3, 4)
        assertThat(N3397_MaximumNumberOfDistinctElementsAfterOperations().maxDistinctElements(nums, 2)).isEqualTo(6)
    }

    @Test
    fun maxDistinctElements_Test2() {
        val nums = intArrayOf(4, 4, 4, 4)
        assertThat(N3397_MaximumNumberOfDistinctElementsAfterOperations().maxDistinctElements(nums, 1)).isEqualTo(3)
    }

}