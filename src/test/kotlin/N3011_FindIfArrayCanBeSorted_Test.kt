import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3011_FindIfArrayCanBeSorted_Test {

    @Test
    fun canSortArray_Test1() {
        assertThat(N3011_FindIfArrayCanBeSorted().canSortArray(intArrayOf(8,4,2,30,15))).isTrue()
    }

    @Test
    fun canSortArray_Test2() {
        assertThat(N3011_FindIfArrayCanBeSorted().canSortArray(intArrayOf(1,2,3,4,5))).isTrue()
    }

    @Test
    fun canSortArray_Test3() {
        assertThat(N3011_FindIfArrayCanBeSorted().canSortArray(intArrayOf(3,16,8,4,2))).isFalse()
    }

    @Test
    fun canSortArray_Test4() {
        assertThat(N3011_FindIfArrayCanBeSorted().canSortArray(intArrayOf(1))).isTrue()
    }

    @Test
    fun canSortArray_Test5() {
        assertThat(N3011_FindIfArrayCanBeSorted().canSortArray(intArrayOf(256))).isTrue()
    }
}