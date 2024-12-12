import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2558_TakeGiftsFromTheRichestPile_Test {

    @Test
    fun pickGifts_Test1() {
        assertThat(N2558_TakeGiftsFromTheRichestPile().pickGifts(intArrayOf(25, 64, 9, 4, 100), 4)).isEqualTo(29)
    }

    @Test
    fun pickGifts_Test2() {
        assertThat(N2558_TakeGiftsFromTheRichestPile().pickGifts(intArrayOf(1, 1, 1, 1), 4)).isEqualTo(4)
    }
}