import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1488_AvoidFloodInTheCity_Test {

    @Test
    fun avoidFlood_Test1() {
        assertThat(N1488_AvoidFloodInTheCity().avoidFlood(intArrayOf(1, 2, 3, 4)))
            .containsExactly(-1, -1, -1, -1)
    }

    @Test
    fun avoidFlood_Test2() {
        assertThat(N1488_AvoidFloodInTheCity().avoidFlood(intArrayOf(1, 2, 0, 0, 2, 1)))
            .isIn(intArrayOf(-1, -1, 2, 1, -1, -1), intArrayOf(-1, -1, 1, 2, -1, -1))
    }

    @Test
    fun avoidFlood_Test3() {
        assertThat(N1488_AvoidFloodInTheCity().avoidFlood(intArrayOf(1, 2, 0, 1, 2))).isEmpty()
    }

}