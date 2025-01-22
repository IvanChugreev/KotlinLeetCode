import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1765_MapOfHighestPeak_Test {

    @Test
    fun highestPeak_Test1() {
        assertThat(N1765_MapOfHighestPeak().highestPeak(arrayOf(intArrayOf(0, 1), intArrayOf(0, 0))))
            .isEqualTo(arrayOf(intArrayOf(1, 0), intArrayOf(2, 1)))
    }

    @Test
    fun highestPeak_Test2() {
        val isWater = arrayOf(intArrayOf(0, 0, 1), intArrayOf(1, 0, 0), intArrayOf(0, 0, 0))
        assertThat(N1765_MapOfHighestPeak().highestPeak(isWater))
            .isEqualTo(arrayOf(intArrayOf(1, 1, 0), intArrayOf(0, 1, 1), intArrayOf(1, 2, 2)))
    }
}