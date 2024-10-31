import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1671_MinimumNumberOfRemovalsToMakeMountainArray_Test {

    @Test
    fun minimumMountainRemovals_Test1() {
        val nums = intArrayOf(1, 3, 1)
        assertThat(N1671_MinimumNumberOfRemovalsToMakeMountainArray().minimumMountainRemovals(nums)).isEqualTo(0)
    }

    @Test
    fun minimumMountainRemovals_Test2() {
        val nums = intArrayOf(2, 1, 1, 5, 6, 2, 3, 1)
        assertThat(N1671_MinimumNumberOfRemovalsToMakeMountainArray().minimumMountainRemovals(nums)).isEqualTo(3)
    }

    @Test
    fun minimumMountainRemovals_Test3() {
        val nums = intArrayOf(100, 92, 89, 77, 74, 66, 64, 66, 64)
        assertThat(N1671_MinimumNumberOfRemovalsToMakeMountainArray().minimumMountainRemovals(nums)).isEqualTo(6)
    }

    @Test
    fun minimumMountainRemovals_Test4() {
        val nums = intArrayOf(4, 3, 2, 1, 1, 2, 3, 1)
        assertThat(N1671_MinimumNumberOfRemovalsToMakeMountainArray().minimumMountainRemovals(nums)).isEqualTo(4)
    }
}