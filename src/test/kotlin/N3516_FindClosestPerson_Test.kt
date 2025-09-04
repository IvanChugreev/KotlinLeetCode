import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3516_FindClosestPerson_Test {

    @Test
    fun findClosest_Test1() {
        assertThat(N3516_FindClosestPerson().findClosest(2, 7, 4)).isEqualTo(1)
    }

    @Test
    fun findClosest_Test2() {
        assertThat(N3516_FindClosestPerson().findClosest(2, 5, 6)).isEqualTo(2)
    }

    @Test
    fun findClosest_Test3() {
        assertThat(N3516_FindClosestPerson().findClosest(1, 5, 3)).isEqualTo(0)
    }

}