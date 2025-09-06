import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3495_MinimumOperationsToMakeArrayElementsZero_Test {

    @Test
    fun minOperations_Test1() {
        val queries = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        assertThat(N3495_MinimumOperationsToMakeArrayElementsZero().minOperations(queries)).isEqualTo(3)
    }

    @Test
    fun minOperations_Test2() {
        val queries = arrayOf(intArrayOf(2, 6))
        assertThat(N3495_MinimumOperationsToMakeArrayElementsZero().minOperations(queries)).isEqualTo(4)
    }

    @Test
    fun minOperations_Test3() {
        val queries = arrayOf(intArrayOf(1, 1000000000))
        assertThat(N3495_MinimumOperationsToMakeArrayElementsZero().minOperations(queries)).isEqualTo(7321043037)
    }

    @Test
    fun minOperations_Test4() {
        val queries = arrayOf(intArrayOf(1, 16))
        assertThat(N3495_MinimumOperationsToMakeArrayElementsZero().minOperations(queries)).isEqualTo(15)
    }

    @Test
    fun minOperations_Test5() {
        val queries = arrayOf(intArrayOf(1, 17))
        assertThat(N3495_MinimumOperationsToMakeArrayElementsZero().minOperations(queries)).isEqualTo(17)
    }
}