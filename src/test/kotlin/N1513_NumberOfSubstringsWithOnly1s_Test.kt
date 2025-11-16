import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1513_NumberOfSubstringsWithOnly1s_Test {

    @Test
    fun numSub_Test1() {
        assertThat(N1513_NumberOfSubstringsWithOnly1s().numSub("0110111")).isEqualTo(9)
    }

    @Test
    fun numSub_Test2() {
        assertThat(N1513_NumberOfSubstringsWithOnly1s().numSub("101")).isEqualTo(2)
    }

    @Test
    fun numSub_Test3() {
        assertThat(N1513_NumberOfSubstringsWithOnly1s().numSub("111111")).isEqualTo(21)
    }

}