import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1014_BestSightseeingPair_Test {

    @Test
    fun maxScoreSightseeingPair_Test1() {
        assertThat(N1014_BestSightseeingPair().maxScoreSightseeingPair(intArrayOf(8, 1, 5, 2, 6))).isEqualTo(11)
    }

    @Test
    fun maxScoreSightseeingPair_Test2() {
        assertThat(N1014_BestSightseeingPair().maxScoreSightseeingPair(intArrayOf(1, 2))).isEqualTo(2)
    }
}