import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3005_CountElementsWithMaximumFrequency_Test {

    @Test
    fun maxFrequencyElements_Test1() {
        assertThat(N3005_CountElementsWithMaximumFrequency().maxFrequencyElements(intArrayOf(1, 2, 2, 3, 1, 4)))
            .isEqualTo(4)
    }

    @Test
    fun maxFrequencyElements_Test2() {
        assertThat(N3005_CountElementsWithMaximumFrequency().maxFrequencyElements(intArrayOf(1, 2, 3, 4, 5)))
            .isEqualTo(5)
    }

}