import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1760_MinimumLimitOfBallsInABag_Test {

    @Test
    fun minimumSize_Test1() {
        assertThat(N1760_MinimumLimitOfBallsInABag().minimumSize(intArrayOf(9), 2)).isEqualTo(3)
    }

    @Test
    fun minimumSize_Test2() {
        assertThat(N1760_MinimumLimitOfBallsInABag().minimumSize(intArrayOf(2, 4, 8, 2), 4)).isEqualTo(2)
    }

    @Test
    fun minimumSize_Test3() {
        assertThat(N1760_MinimumLimitOfBallsInABag().minimumSize(intArrayOf(1, 1, 9, 8), 1)).isEqualTo(8)
    }

    @Test
    fun minimumSize_Test4() {
        assertThat(N1760_MinimumLimitOfBallsInABag().minimumSize(intArrayOf(1, 1, 9, 8), 2)).isEqualTo(5)
    }

    @Test
    fun minimumSize_Test5() {
        assertThat(N1760_MinimumLimitOfBallsInABag().minimumSize(intArrayOf(1, 1, 9, 8), 3)).isEqualTo(4)
    }

    @Test
    fun minimumSize_Test6() {
        assertThat(N1760_MinimumLimitOfBallsInABag().minimumSize(intArrayOf(1, 1, 9, 8), 4)).isEqualTo(3)
    }

    @Test
    fun minimumSize_Test7() {
        assertThat(N1760_MinimumLimitOfBallsInABag().minimumSize(intArrayOf(1, 1, 9, 8), 5)).isEqualTo(3)
    }

    @Test
    fun minimumSize_Test8() {
        assertThat(N1760_MinimumLimitOfBallsInABag().minimumSize(intArrayOf(1, 1, 9, 8), 6)).isEqualTo(3)
    }

    @Test
    fun minimumSize_Test9() {
        assertThat(N1760_MinimumLimitOfBallsInABag().minimumSize(intArrayOf(1, 1, 9, 8), 7)).isEqualTo(2)
    }
}