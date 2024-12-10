import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3152_SpecialArray2_Test {

    @Test
    fun isArraySpecial_Test1() {
        assertThat(N3152_SpecialArray2().isArraySpecial(intArrayOf(3, 4, 1, 2, 6), arrayOf(intArrayOf(0, 4))))
            .containsExactly(false)
    }

    @Test
    fun isArraySpecial_Test2() {
        val nums = intArrayOf(4, 3, 1, 6)
        val queries = arrayOf(intArrayOf(0, 2), intArrayOf(2, 3))
        assertThat(N3152_SpecialArray2().isArraySpecial(nums, queries)).isEqualTo(booleanArrayOf(false, true))
    }

    @Test
    fun isArraySpecial_Test3() {
        assertThat(N3152_SpecialArray2().isArraySpecial(intArrayOf(1, 8), arrayOf(intArrayOf(1, 1))))
            .containsExactly(true)
    }
}