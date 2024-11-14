import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2064_MinimizedMaximumOfProductsDistributedToAnyStore_Test {

    @Test
    fun minimizedMaximum_Test1() {
        val quantities = intArrayOf(11, 6)
        assertThat(N2064_MinimizedMaximumOfProductsDistributedToAnyStore().minimizedMaximum(6, quantities))
            .isEqualTo(3)
    }

    @Test
    fun minimizedMaximum_Test2() {
        val quantities = intArrayOf(15, 10, 10)
        assertThat(N2064_MinimizedMaximumOfProductsDistributedToAnyStore().minimizedMaximum(7, quantities))
            .isEqualTo(5)
    }

    @Test
    fun minimizedMaximum_Test3() {
        val quantities = intArrayOf(100000)
        assertThat(N2064_MinimizedMaximumOfProductsDistributedToAnyStore().minimizedMaximum(1, quantities))
            .isEqualTo(100000)
    }
}