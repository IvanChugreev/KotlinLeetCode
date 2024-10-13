import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1942_TheNumberOfTheSmallestUnoccupiedChair_Test {

    @Test
    fun smallestChair_Test1() {
        val times = arrayOf(intArrayOf(1, 4), intArrayOf(2, 3), intArrayOf(4, 6))
        assertThat(N1942_TheNumberOfTheSmallestUnoccupiedChair().smallestChair(times, 1)).isEqualTo(1)
    }

    @Test
    fun smallestChair_Test2() {
        val times = arrayOf(intArrayOf(3, 10), intArrayOf(1, 5), intArrayOf(2, 6))
        assertThat(N1942_TheNumberOfTheSmallestUnoccupiedChair().smallestChair(times, 0)).isEqualTo(2)
    }

    @Test
    fun smallestChair_Test3() {
        val times = arrayOf(intArrayOf(33889,98676), intArrayOf(80071,89737), intArrayOf(44118,52565), intArrayOf(52992,84310),
            intArrayOf(78492,88209), intArrayOf(21695,67063), intArrayOf(84622,95452), intArrayOf(98048,98856), intArrayOf(98411,99433),
            intArrayOf(55333,56548), intArrayOf(65375,88566), intArrayOf(55011,62821), intArrayOf(48548,48656), intArrayOf(87396,94825),
            intArrayOf(55273,81868), intArrayOf(75629,91467))
        assertThat(N1942_TheNumberOfTheSmallestUnoccupiedChair().smallestChair(times, 6)).isEqualTo(2)
    }

    @Test
    fun smallestChair_Test4() {
        val times = arrayOf(intArrayOf(4,5), intArrayOf(12,13), intArrayOf(5,6), intArrayOf(1,2),
            intArrayOf(8,9), intArrayOf(9,10), intArrayOf(6,7), intArrayOf(3,4), intArrayOf(7,8),
            intArrayOf(13,14), intArrayOf(15,16), intArrayOf(14,15), intArrayOf(10,11), intArrayOf(11,12),
            intArrayOf(2,3), intArrayOf(16,17))
        assertThat(N1942_TheNumberOfTheSmallestUnoccupiedChair().smallestChair(times, 15)).isEqualTo(0)
    }
}