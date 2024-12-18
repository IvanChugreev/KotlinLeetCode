import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1475_FinalPricesWithASpecialDiscountInAShop_Test {

    @Test
    fun finalPrices_Test1() {
        assertThat(N1475_FinalPricesWithASpecialDiscountInAShop().finalPrices(intArrayOf(8, 4, 6, 2, 3)))
            .containsExactly(4, 2, 4, 2, 3)
    }

    @Test
    fun finalPrices_Test2() {
        assertThat(N1475_FinalPricesWithASpecialDiscountInAShop().finalPrices(intArrayOf(1, 2, 3, 4, 5)))
            .containsExactly(1, 2, 3, 4, 5)
    }

    @Test
    fun finalPrices_Test3() {
        assertThat(N1475_FinalPricesWithASpecialDiscountInAShop().finalPrices(intArrayOf(10, 1, 1, 6)))
            .containsExactly(9, 0, 1, 6)
    }
}