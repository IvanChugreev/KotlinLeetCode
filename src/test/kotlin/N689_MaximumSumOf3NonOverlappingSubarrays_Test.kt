import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N689_MaximumSumOf3NonOverlappingSubarrays_Test {

    @Test
    fun maxSumOfThreeSubarrays_Test1() {
        val nums = intArrayOf(1, 2, 1, 2, 6, 7, 5, 1)
        assertThat(N689_MaximumSumOf3NonOverlappingSubarrays().maxSumOfThreeSubarrays(nums, 2))
            .containsExactly(0, 3, 5)
    }

    @Test
    fun maxSumOfThreeSubarrays_Test2() {
        val nums = intArrayOf(1, 2, 1, 2, 1, 2, 1, 2, 1)
        assertThat(N689_MaximumSumOf3NonOverlappingSubarrays().maxSumOfThreeSubarrays(nums, 2))
            .containsExactly(0, 2, 4)
    }
}