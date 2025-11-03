import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1578_MinimumTimeToMakeRopeColorful_Test {

    @Test
    fun minCost_Test1() {
        assertThat(N1578_MinimumTimeToMakeRopeColorful().minCost("abaac", intArrayOf(1, 2, 3, 4, 5)))
            .isEqualTo(3)
    }

    @Test
    fun minCost_Test2() {
        assertThat(N1578_MinimumTimeToMakeRopeColorful().minCost("abc", intArrayOf(1, 2, 3)))
            .isEqualTo(0)
    }

    @Test
    fun minCost_Test3() {
        assertThat(N1578_MinimumTimeToMakeRopeColorful().minCost("aabaa", intArrayOf(1, 2, 3, 4, 1)))
            .isEqualTo(2)
    }

}