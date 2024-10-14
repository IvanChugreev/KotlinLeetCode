import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2530_MaximalScoreAfterApplyingKOperations_Test {

    @Test
    fun maxKelements_Test1() {
        val nums = intArrayOf(10, 10, 10, 10, 10)
        assertThat(N2530_MaximalScoreAfterApplyingKOperations().maxKelements(nums, 5)).isEqualTo(50)
    }

    @Test
    fun maxKelements_Test2() {
        val nums = intArrayOf(1, 10, 3, 3, 3)
        assertThat(N2530_MaximalScoreAfterApplyingKOperations().maxKelements(nums, 3)).isEqualTo(17)
    }

    @Test
    fun maxKelements_Test3() {
        val nums = intArrayOf(1, 3, 1, 1, 1)
        assertThat(N2530_MaximalScoreAfterApplyingKOperations().maxKelements(nums, 5)).isEqualTo(7)
    }
}