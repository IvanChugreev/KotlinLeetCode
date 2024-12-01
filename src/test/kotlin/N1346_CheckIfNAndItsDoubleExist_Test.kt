import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1346_CheckIfNAndItsDoubleExist_Test {

    @Test
    fun checkIfExist_Test1() {
        assertThat(N1346_CheckIfNAndItsDoubleExist().checkIfExist(intArrayOf(10, 2, 5, 3))).isTrue()
    }

    @Test
    fun checkIfExist_Test2() {
        assertThat(N1346_CheckIfNAndItsDoubleExist().checkIfExist(intArrayOf(3, 1, 7, 11))).isFalse()
    }
}