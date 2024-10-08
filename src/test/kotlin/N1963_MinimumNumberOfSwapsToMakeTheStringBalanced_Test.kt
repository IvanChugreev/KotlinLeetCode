import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1963_MinimumNumberOfSwapsToMakeTheStringBalanced_Test {

    @Test
    fun minSwaps_Test1() {
        assertThat(N1963_MinimumNumberOfSwapsToMakeTheStringBalanced().minSwaps("][][")).isEqualTo(1)
    }

    @Test
    fun minSwaps_Test2() {
        assertThat(N1963_MinimumNumberOfSwapsToMakeTheStringBalanced().minSwaps("]]][[[")).isEqualTo(2)
    }

    @Test
    fun minSwaps_Test3() {
        assertThat(N1963_MinimumNumberOfSwapsToMakeTheStringBalanced().minSwaps("[]")).isEqualTo(0)
    }
}