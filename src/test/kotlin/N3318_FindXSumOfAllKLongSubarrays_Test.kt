import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3318_FindXSumOfAllKLongSubarrays_Test {

    @Test
    fun findXSum_Test1() {
        assertThat(N3318_FindXSumOfAllKLongSubarrays().findXSum(intArrayOf(1, 1, 2, 2, 3, 4, 2, 3), 6, 2))
            .containsExactly(6, 10, 12)
    }

    @Test
    fun findXSum_Test2() {
        assertThat(N3318_FindXSumOfAllKLongSubarrays().findXSum(intArrayOf(3, 8, 7, 8, 7, 5), 2, 2))
            .containsExactly(11, 15, 15, 15, 12)
    }

    @Test
    fun findXSum_Test3() {
        assertThat(N3318_FindXSumOfAllKLongSubarrays().findXSum(intArrayOf(6, 4, 5, 5, 1, 3, 6, 3, 4), 7, 1))
            .containsExactly(12, 10, 10)
    }

}