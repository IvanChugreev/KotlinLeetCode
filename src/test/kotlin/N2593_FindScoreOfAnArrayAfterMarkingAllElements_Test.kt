import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2593_FindScoreOfAnArrayAfterMarkingAllElements_Test {

    @Test
    fun findScore_Test1() {
        assertThat(N2593_FindScoreOfAnArrayAfterMarkingAllElements().findScore(intArrayOf(2, 1, 3, 4, 5, 2)))
            .isEqualTo(7)
    }

    @Test
    fun findScore_Test2() {
        assertThat(N2593_FindScoreOfAnArrayAfterMarkingAllElements().findScore(intArrayOf(2, 3, 5, 1, 3, 2)))
            .isEqualTo(5)
    }
}