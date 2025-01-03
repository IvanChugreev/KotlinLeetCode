import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2270_NumberOfWaysToSplitArray_Test {

    @Test
    fun waysToSplitArray_Test1() {
        assertThat(N2270_NumberOfWaysToSplitArray().waysToSplitArray(intArrayOf(10, 4, -8, 7))).isEqualTo(2)
    }

    @Test
    fun waysToSplitArray_Test2() {
        assertThat(N2270_NumberOfWaysToSplitArray().waysToSplitArray(intArrayOf(2, 3, 1, 0))).isEqualTo(2)
    }
}