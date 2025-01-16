import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2425_BitwiseXOROfAllPairings_Test {

    @Test
    fun xorAllNums_Test1() {
        assertThat(N2425_BitwiseXOROfAllPairings().xorAllNums(intArrayOf(2, 1, 3), intArrayOf(10, 2, 5, 0)))
            .isEqualTo(13)
    }

    @Test
    fun xorAllNums_Test2() {
        assertThat(N2425_BitwiseXOROfAllPairings().xorAllNums(intArrayOf(1, 2), intArrayOf(3, 4))).isEqualTo(0)
    }
}