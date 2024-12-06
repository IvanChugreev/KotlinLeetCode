import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2554_MaximumNumberOfIntegersToChooseFromARange_Test {

    @Test
    fun maxCount_Test1() {
        assertThat(N2554_MaximumNumberOfIntegersToChooseFromARange().maxCount(intArrayOf(1, 6, 5), 5, 6))
            .isEqualTo(2)
    }

    @Test
    fun maxCount_Test2() {
        assertThat(N2554_MaximumNumberOfIntegersToChooseFromARange().maxCount(intArrayOf(1, 2, 3, 4, 5, 6, 7), 8, 1))
            .isEqualTo(0)
    }

    @Test
    fun maxCount_Test3() {
        assertThat(N2554_MaximumNumberOfIntegersToChooseFromARange().maxCount(intArrayOf(11), 7, 50))
            .isEqualTo(7)
    }
}