import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3254_FindThePowerOfKSizeSubarrays_Test {

    @Test
    fun resultsArray_Test1() {
        val nums = intArrayOf(1, 2, 3, 4, 3, 2, 5)
        assertThat(N3254_FindThePowerOfKSizeSubarrays().resultsArray(nums, 3)).containsExactly(3, 4, -1, -1, -1)
    }

    @Test
    fun resultsArray_Test2() {
        val nums = intArrayOf(2, 2, 2, 2, 2)
        assertThat(N3254_FindThePowerOfKSizeSubarrays().resultsArray(nums, 4)).containsExactly(-1, -1)
    }

    @Test
    fun resultsArray_Test3() {
        val nums = intArrayOf(3, 2, 3, 2, 3, 2)
        assertThat(N3254_FindThePowerOfKSizeSubarrays().resultsArray(nums, 2)).containsExactly(-1, 3, -1, 3, -1)
    }

    @Test
    fun resultsArray_Test4() {
        val nums = intArrayOf(3, 2, 3, 2, 3, 2)
        assertThat(N3254_FindThePowerOfKSizeSubarrays().resultsArray(nums, 1)).containsExactly(3, 2, 3, 2, 3, 2)
    }

    @Test
    fun resultsArray_Test5() {
        val nums = intArrayOf(3, 23, 24, 25, 26)
        assertThat(N3254_FindThePowerOfKSizeSubarrays().resultsArray(nums, 4)).containsExactly(-1, 26)
    }
}