import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N632_SmallestRangeCoveringElementsFromKLists_Test {

    @Test
    fun smallestRange_Test1() {
        val nums = listOf(listOf(4, 10, 15, 24, 26), listOf(0, 9, 12, 20), listOf(5, 18, 22, 30))
        assertThat(N632_SmallestRangeCoveringElementsFromKLists().smallestRange(nums)).containsExactly(20, 24)
    }

    @Test
    fun smallestRange_Test2() {
        val nums = listOf(listOf(1, 2, 3), listOf(1, 2, 3), listOf(1, 2, 3))
        assertThat(N632_SmallestRangeCoveringElementsFromKLists().smallestRange(nums)).containsExactly(1, 1)
    }
}