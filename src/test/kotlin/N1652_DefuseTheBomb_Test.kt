import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1652_DefuseTheBomb_Test {

    @Test
    fun decrypt_Test1() {
        assertThat(N1652_DefuseTheBomb().decrypt(intArrayOf(5, 7, 1, 4), 3)).containsExactly(12, 10, 16, 13)
    }

    @Test
    fun decrypt_Test2() {
        assertThat(N1652_DefuseTheBomb().decrypt(intArrayOf(1, 2, 3, 4), 0)).containsExactly(0, 0, 0, 0)
    }

    @Test
    fun decrypt_Test3() {
        assertThat(N1652_DefuseTheBomb().decrypt(intArrayOf(2, 4, 9, 3), -2)).containsExactly(12, 5, 6, 13)
    }
}