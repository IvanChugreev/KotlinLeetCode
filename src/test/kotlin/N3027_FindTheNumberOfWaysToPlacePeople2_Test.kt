import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3027_FindTheNumberOfWaysToPlacePeople2_Test {

    @Test
    fun numberOfPairs_Test1() {
        val points = arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 3))
        assertThat(N3027_FindTheNumberOfWaysToPlacePeople2().numberOfPairs(points)).isEqualTo(0)
    }

    @Test
    fun numberOfPairs_Test2() {
        val points = arrayOf(intArrayOf(6, 2), intArrayOf(4, 4), intArrayOf(2, 6))
        assertThat(N3027_FindTheNumberOfWaysToPlacePeople2().numberOfPairs(points)).isEqualTo(2)
    }

    @Test
    fun numberOfPairs_Test3() {
        val points = arrayOf(intArrayOf(3, 1), intArrayOf(1, 3), intArrayOf(1, 1))
        assertThat(N3027_FindTheNumberOfWaysToPlacePeople2().numberOfPairs(points)).isEqualTo(2)
    }
}