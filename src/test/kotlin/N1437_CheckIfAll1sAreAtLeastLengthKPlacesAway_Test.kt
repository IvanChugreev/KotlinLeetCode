import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1437_CheckIfAll1sAreAtLeastLengthKPlacesAway_Test {

    @Test
    fun kLengthApart_Test1() {
        val nums = intArrayOf(1, 0, 0, 0, 1, 0, 0, 1)
        assertThat(N1437_CheckIfAll1sAreAtLeastLengthKPlacesAway().kLengthApart(nums, 2)).isTrue
    }

    @Test
    fun kLengthApart_Test2() {
        val nums = intArrayOf(1, 0, 0, 1, 0, 1)
        assertThat(N1437_CheckIfAll1sAreAtLeastLengthKPlacesAway().kLengthApart(nums, 2)).isFalse
    }

}