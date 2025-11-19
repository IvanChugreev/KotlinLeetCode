import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N717_1bitAnd2bitCharacters_Test {

    @Test
    fun isOneBitCharacter_Test1() {
        assertThat(N717_1bitAnd2bitCharacters().isOneBitCharacter(intArrayOf(1, 0, 0))).isTrue
    }

    @Test
    fun isOneBitCharacter_Test2() {
        assertThat(N717_1bitAnd2bitCharacters().isOneBitCharacter(intArrayOf(1, 1, 1, 0))).isFalse
    }

}