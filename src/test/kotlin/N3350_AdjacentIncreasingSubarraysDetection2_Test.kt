import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3350_AdjacentIncreasingSubarraysDetection2_Test {

    @Test
    fun maxIncreasingSubarrays_Test1() {
        val nums = listOf(2, 5, 7, 8, 9, 2, 3, 4, 3, 1)
        assertThat(N3350_AdjacentIncreasingSubarraysDetection2().maxIncreasingSubarrays(nums)).isEqualTo(3)
    }

    @Test
    fun maxIncreasingSubarrays_Test2() {
        val nums = listOf(1, 2, 3, 4, 4, 4, 4, 5, 6, 7)
        assertThat(N3350_AdjacentIncreasingSubarraysDetection2().maxIncreasingSubarrays(nums)).isEqualTo(2)
    }

}