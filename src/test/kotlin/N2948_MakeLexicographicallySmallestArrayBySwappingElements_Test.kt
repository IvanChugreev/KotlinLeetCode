import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2948_MakeLexicographicallySmallestArrayBySwappingElements_Test {

    @Test
    fun lexicographicallySmallestArray_Test1() {
        val nums = intArrayOf(1, 5, 3, 9, 8)
        assertThat(N2948_MakeLexicographicallySmallestArrayBySwappingElements().lexicographicallySmallestArray(nums, 2))
            .containsExactly(1, 3, 5, 8, 9)
    }

    @Test
    fun lexicographicallySmallestArray_Test2() {
        val nums = intArrayOf(1, 7, 6, 18, 2, 1)
        assertThat(N2948_MakeLexicographicallySmallestArrayBySwappingElements().lexicographicallySmallestArray(nums, 3))
            .containsExactly(1, 6, 7, 18, 1, 2)
    }

    @Test
    fun lexicographicallySmallestArray_Test3() {
        val nums = intArrayOf(1, 7, 28, 19, 10)
        assertThat(N2948_MakeLexicographicallySmallestArrayBySwappingElements().lexicographicallySmallestArray(nums, 3))
            .containsExactly(1, 7, 28, 19, 10)
    }
}