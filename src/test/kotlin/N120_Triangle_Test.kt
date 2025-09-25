import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N120_Triangle_Test {

    @Test
    fun minimumTotal_Test1() {
        assertThat(N120_Triangle().minimumTotal(listOf(listOf(2), listOf(3, 4), listOf(6, 5, 7), listOf(4, 1, 8, 3))))
            .isEqualTo(11)
    }

    @Test
    fun minimumTotal_Test2() {
        assertThat(N120_Triangle().minimumTotal(listOf(listOf(-10)))).isEqualTo(-10)
    }

}