import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1545_FindKthBitInNthBinaryString_Test {

    @Test
    fun findKthBit_Test1() {
        assertThat(N1545_FindKthBitInNthBinaryString().findKthBit(3, 1)).isEqualTo('0')
    }

    @Test
    fun findKthBit_Test2() {
        assertThat(N1545_FindKthBitInNthBinaryString().findKthBit(4, 11)).isEqualTo('1')
    }

    @Test
    fun findKthBit_Test3() {
        assertThat(N1545_FindKthBitInNthBinaryString().findKthBit(4, 12)).isEqualTo('0')
    }

    @Test
    fun findKthBit_Test4() {
        assertThat(N1545_FindKthBitInNthBinaryString().findKthBit(4, 13)).isEqualTo('0')
    }
}