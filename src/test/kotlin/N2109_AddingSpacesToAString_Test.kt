import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2109_AddingSpacesToAString_Test {

    @Test
    fun addSpaces_Test1() {
        assertThat(N2109_AddingSpacesToAString().addSpaces("LeetcodeHelpsMeLearn", intArrayOf(8, 13, 15)))
            .isEqualTo("Leetcode Helps Me Learn")
    }

    @Test
    fun addSpaces_Test2() {
        assertThat(N2109_AddingSpacesToAString().addSpaces("icodeinpython", intArrayOf(1, 5, 7, 9)))
            .isEqualTo("i code in py thon")
    }

    @Test
    fun addSpaces_Test3() {
        assertThat(N2109_AddingSpacesToAString().addSpaces("spacing", intArrayOf(0, 1, 2, 3, 4, 5, 6)))
            .isEqualTo(" s p a c i n g")
    }
}