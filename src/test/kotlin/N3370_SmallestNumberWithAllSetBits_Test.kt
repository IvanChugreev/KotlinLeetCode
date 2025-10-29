import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3370_SmallestNumberWithAllSetBits_Test {

    @Test
    fun smallestNumber_Test1() {
        assertThat(N3370_SmallestNumberWithAllSetBits().smallestNumber(5)).isEqualTo(7)
    }

    @Test
    fun smallestNumber_Test2() {
        assertThat(N3370_SmallestNumberWithAllSetBits().smallestNumber(10)).isEqualTo(15)
    }

    @Test
    fun smallestNumber_Test3() {
        assertThat(N3370_SmallestNumberWithAllSetBits().smallestNumber(3)).isEqualTo(3)
    }

}