import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2154_KeepMultiplyingFoundValuesByTwo_Test {

    @Test
    fun findFinalValue_Test1() {
        assertThat(N2154_KeepMultiplyingFoundValuesByTwo().findFinalValue(intArrayOf(5, 3, 6, 1, 12), 3))
            .isEqualTo(24)
    }

    @Test
    fun findFinalValue_Test2() {
        assertThat(N2154_KeepMultiplyingFoundValuesByTwo().findFinalValue(intArrayOf(2, 7, 9), 4))
            .isEqualTo(4)
    }

}