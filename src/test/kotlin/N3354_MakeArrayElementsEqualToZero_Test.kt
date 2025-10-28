import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3354_MakeArrayElementsEqualToZero_Test {

    @Test
    fun countValidSelections_Test1() {
        assertThat(N3354_MakeArrayElementsEqualToZero().countValidSelections(intArrayOf(1, 0, 2, 0, 3)))
            .isEqualTo(2)
    }

    @Test
    fun countValidSelections_Test2() {
        assertThat(N3354_MakeArrayElementsEqualToZero().countValidSelections(intArrayOf(2, 3, 4, 0, 4, 1, 0)))
            .isEqualTo(0)
    }

}