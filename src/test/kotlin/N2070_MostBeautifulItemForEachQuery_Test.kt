import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2070_MostBeautifulItemForEachQuery_Test {

    @Test
    fun maximumBeauty_Test1() {
        val items = arrayOf(intArrayOf(1, 2), intArrayOf(3, 2), intArrayOf(2, 4), intArrayOf(5, 6), intArrayOf(3, 5))
        val queries = intArrayOf(1, 2, 3, 4, 5, 6)
        assertThat(N2070_MostBeautifulItemForEachQuery().maximumBeauty(items, queries))
            .containsExactly(2, 4, 5, 5, 6, 6)
    }

    @Test
    fun maximumBeauty_Test2() {
        val items = arrayOf(intArrayOf(1, 2), intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(1, 4))
        val queries = intArrayOf(1)
        assertThat(N2070_MostBeautifulItemForEachQuery().maximumBeauty(items, queries)).containsExactly(4)
    }

    @Test
    fun maximumBeauty_Test3() {
        val items = arrayOf(intArrayOf(10, 1000))
        val queries = intArrayOf(5)
        assertThat(N2070_MostBeautifulItemForEachQuery().maximumBeauty(items, queries)).containsExactly(0)
    }
}