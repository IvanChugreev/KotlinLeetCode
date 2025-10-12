import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3539_FindSumOfArrayProductOfMagicalSequences_Test {

    @Test
    fun magicalSum_Test1() {
        val nums = intArrayOf(1, 10, 100, 10000, 1000000)
        assertThat(N3539_FindSumOfArrayProductOfMagicalSequences().magicalSum(5, 5, nums))
            .isEqualTo(991600007)
    }

    @Test
    fun magicalSum_Test2() {
        assertThat(N3539_FindSumOfArrayProductOfMagicalSequences().magicalSum(2, 2, intArrayOf(5, 4, 3, 2, 1)))
            .isEqualTo(170)
    }

    @Test
    fun magicalSum_Test3() {
        assertThat(N3539_FindSumOfArrayProductOfMagicalSequences().magicalSum(1, 1, intArrayOf(28)))
            .isEqualTo(28)
    }

}