import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2516_TakeKOfEachCharacterFromLeftAndRight_Test {

    @Test
    fun takeCharacters_Test1() {
        assertThat(N2516_TakeKOfEachCharacterFromLeftAndRight().takeCharacters("aabaaaacaabc", 2)).isEqualTo(8)
    }

    @Test
    fun takeCharacters_Test2() {
        assertThat(N2516_TakeKOfEachCharacterFromLeftAndRight().takeCharacters("a", 1)).isEqualTo(-1)
    }
}