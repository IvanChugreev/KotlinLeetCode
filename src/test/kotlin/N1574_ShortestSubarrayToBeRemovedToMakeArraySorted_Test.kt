import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1574_ShortestSubarrayToBeRemovedToMakeArraySorted_Test {

    @Test
    fun findLengthOfShortestSubarray_Test1() {
        val arr = intArrayOf(1, 2, 3, 10, 4, 2, 3, 5)
        assertThat(N1574_ShortestSubarrayToBeRemovedToMakeArraySorted().findLengthOfShortestSubarray(arr)).isEqualTo(3)
    }

    @Test
    fun findLengthOfShortestSubarray_Test2() {
        val arr = intArrayOf(5, 4, 3, 2, 1)
        assertThat(N1574_ShortestSubarrayToBeRemovedToMakeArraySorted().findLengthOfShortestSubarray(arr)).isEqualTo(4)
    }

    @Test
    fun findLengthOfShortestSubarray_Test3() {
        val arr = intArrayOf(1, 2, 3)
        assertThat(N1574_ShortestSubarrayToBeRemovedToMakeArraySorted().findLengthOfShortestSubarray(arr)).isEqualTo(0)
    }
}