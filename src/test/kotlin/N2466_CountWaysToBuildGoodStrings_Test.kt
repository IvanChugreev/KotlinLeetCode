import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2466_CountWaysToBuildGoodStrings_Test {

    @Test
    fun countGoodStrings_Test1() {
        assertThat(N2466_CountWaysToBuildGoodStrings().countGoodStrings(3, 3, 1, 1)).isEqualTo(8)
    }

    @Test
    fun countGoodStrings_Test2() {
        assertThat(N2466_CountWaysToBuildGoodStrings().countGoodStrings(2, 3, 1, 2)).isEqualTo(5)
    }

    @Test
    fun countGoodStrings_Test3() {
        assertThat(N2466_CountWaysToBuildGoodStrings().countGoodStrings(12, 13, 3, 5)).isEqualTo(4)
    }
}