import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1304_FindNUniqueIntegersSumUpToZero_Test {

    @Test
    fun sumZero_Test1() {
        assertThat(N1304_FindNUniqueIntegersSumUpToZero().sumZero(5).sum()).isEqualTo(0)
    }

    @Test
    fun sumZero_Test2() {
        assertThat(N1304_FindNUniqueIntegersSumUpToZero().sumZero(3).sum()).isEqualTo(0)
    }

    @Test
    fun sumZero_Test3() {
        assertThat(N1304_FindNUniqueIntegersSumUpToZero().sumZero(1).sum()).isEqualTo(0)
    }

    @Test
    fun sumZero_Test4() {
        assertThat(N1304_FindNUniqueIntegersSumUpToZero().sumZero(4).sum()).isEqualTo(0)
    }

}