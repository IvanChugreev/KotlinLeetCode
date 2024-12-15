import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.offset
import org.junit.jupiter.api.Test

class N1792_MaximumAveragePassRatio_Test {

    @Test
    fun maxAverageRatio_Test1() {
        val classes = arrayOf(intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(2, 2))
        assertThat(N1792_MaximumAveragePassRatio().maxAverageRatio(classes, 2))
            .isCloseTo(0.78333, offset(0.00001))
    }

    @Test
    fun maxAverageRatio_Test2() {
        val classes = arrayOf(intArrayOf(2, 4), intArrayOf(3, 9), intArrayOf(4, 5), intArrayOf(2, 10))
        assertThat(N1792_MaximumAveragePassRatio().maxAverageRatio(classes, 4))
            .isCloseTo(0.53485, offset(0.00001))
    }
}