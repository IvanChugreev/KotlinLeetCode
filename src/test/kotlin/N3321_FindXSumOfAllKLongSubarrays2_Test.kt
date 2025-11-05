import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3321_FindXSumOfAllKLongSubarrays2_Test {

    @Test
    fun findXSum_Test1() {
        assertThat(N3321_FindXSumOfAllKLongSubarrays2().findXSum(intArrayOf(1, 1, 2, 2, 3, 4, 2, 3), 6, 2))
            .containsExactly(6, 10, 12)
    }

    @Test
    fun findXSum_Test2() {
        assertThat(N3321_FindXSumOfAllKLongSubarrays2().findXSum(intArrayOf(3, 8, 7, 8, 7, 5), 2, 2))
            .containsExactly(11, 15, 15, 15, 12)
    }

    @Test
    fun findXSum_Test3() {
        assertThat(N3321_FindXSumOfAllKLongSubarrays2().findXSum(intArrayOf(6, 4, 5, 5, 1, 3, 6, 3, 4), 7, 1))
            .containsExactly(12, 10, 10)
    }

    @Test
    fun findXSum_Test4() {
        val nums = intArrayOf(1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000)
        assertThat(N3321_FindXSumOfAllKLongSubarrays2().findXSum(nums, 6, 2)).containsExactly(6000000000L)
    }

}