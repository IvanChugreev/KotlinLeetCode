import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2657_FindThePrefixCommonArrayOfTwoArrays_Test {

    @Test
    fun findThePrefixCommonArray_Test1() {
        val A = intArrayOf(1, 3, 2, 4)
        val B = intArrayOf(3, 1, 2, 4)
        assertThat(N2657_FindThePrefixCommonArrayOfTwoArrays().findThePrefixCommonArray(A, B))
            .containsExactly(0, 2, 3, 4)
    }

    @Test
    fun findThePrefixCommonArray_Test2() {
        val A = intArrayOf(2, 3, 1)
        val B = intArrayOf(3, 1, 2)
        assertThat(N2657_FindThePrefixCommonArrayOfTwoArrays().findThePrefixCommonArray(A, B))
            .containsExactly(0, 1, 3)
    }
}