import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2536_IncrementSubmatricesByOne_Test {

    @Test
    fun rangeAddQueries_Test1() {
        val queries = arrayOf(intArrayOf(1, 1, 2, 2), intArrayOf(0, 0, 1, 1))
        assertThat(N2536_IncrementSubmatricesByOne().rangeAddQueries(3, queries))
            .isDeepEqualTo(arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 2, 1), intArrayOf(0, 1, 1)))
    }

    @Test
    fun rangeAddQueries_Test2() {
        assertThat(N2536_IncrementSubmatricesByOne().rangeAddQueries(2, arrayOf(intArrayOf(0, 0, 1, 1))))
            .isDeepEqualTo(arrayOf(intArrayOf(1, 1), intArrayOf(1, 1)))
    }

}