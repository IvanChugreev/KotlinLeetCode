import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2011_FinalValueOfVariableAfterPerformingOperations_Test {

    @Test
    fun finalValueAfterOperations_Test1() {
        val operations = arrayOf("--X", "X++", "X++")
        assertThat(N2011_FinalValueOfVariableAfterPerformingOperations().finalValueAfterOperations(operations))
            .isEqualTo(1)
    }

    @Test
    fun finalValueAfterOperations_Test2() {
        val operations = arrayOf("++X", "++X", "X++")
        assertThat(N2011_FinalValueOfVariableAfterPerformingOperations().finalValueAfterOperations(operations))
            .isEqualTo(3)
    }

    @Test
    fun finalValueAfterOperations_Test3() {
        val operations = arrayOf("X++", "++X", "--X", "X--")
        assertThat(N2011_FinalValueOfVariableAfterPerformingOperations().finalValueAfterOperations(operations))
            .isEqualTo(0)
    }

}