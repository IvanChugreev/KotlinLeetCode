import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2749_MinimumOperationsToMakeTheIntegerZero_Test {

    @Test
    fun makeTheIntegerZero_Test1() {
        assertThat(N2749_MinimumOperationsToMakeTheIntegerZero().makeTheIntegerZero(3, -2)).isEqualTo(3)
    }

    @Test
    fun makeTheIntegerZero_Test2() {
        assertThat(N2749_MinimumOperationsToMakeTheIntegerZero().makeTheIntegerZero(5, 7)).isEqualTo(-1)
    }

}