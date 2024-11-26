import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2924_FindChampion2_Test {

    @Test
    fun findChampion_Test1() {
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2))
        assertThat(N2924_FindChampion2().findChampion(3, edges)).isEqualTo(0)
    }

    @Test
    fun findChampion_Test2() {
        val edges = arrayOf(intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(1, 2))
        assertThat(N2924_FindChampion2().findChampion(4, edges)).isEqualTo(-1)
    }

    @Test
    fun findChampion_Test3() {
        val edges = arrayOf(intArrayOf(3, 0), intArrayOf(0, 2), intArrayOf(3, 2), intArrayOf(3, 1), intArrayOf(3, 4))
        assertThat(N2924_FindChampion2().findChampion(5, edges)).isEqualTo(3)
    }
}