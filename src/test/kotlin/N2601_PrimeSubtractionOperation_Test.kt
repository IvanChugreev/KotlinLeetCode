import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2601_PrimeSubtractionOperation_Test {

    @Test
    fun primeSubOperation_Test1() {
        val nums = intArrayOf(4, 9, 6, 10)
        assertThat(N2601_PrimeSubtractionOperation().primeSubOperation(nums)).isTrue()
    }

    @Test
    fun primeSubOperation_Test2() {
        val nums = intArrayOf(6, 8, 11, 12)
        assertThat(N2601_PrimeSubtractionOperation().primeSubOperation(nums)).isTrue()
    }

    @Test
    fun primeSubOperation_Test3() {
        val nums = intArrayOf(5, 8, 3)
        assertThat(N2601_PrimeSubtractionOperation().primeSubOperation(nums)).isFalse()
    }

    @Test
    fun primeSubOperation_Test4() {
        val nums = intArrayOf(998, 2)
        assertThat(N2601_PrimeSubtractionOperation().primeSubOperation(nums)).isTrue()
    }
}