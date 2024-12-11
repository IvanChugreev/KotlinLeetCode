import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2779_MaximumBeautyOfAnArrayAfterApplyingOperation_Test {

    @Test
    fun maximumBeauty_Test1() {
        assertThat(N2779_MaximumBeautyOfAnArrayAfterApplyingOperation().maximumBeauty(intArrayOf(4, 6, 1, 2), 2))
            .isEqualTo(3)
    }

    @Test
    fun maximumBeauty_Test2() {
        assertThat(N2779_MaximumBeautyOfAnArrayAfterApplyingOperation().maximumBeauty(intArrayOf(1, 1, 1, 1), 10))
            .isEqualTo(4)
    }
}