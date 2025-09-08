import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class N1317_ConvertIntegerToTheSumOfTwoNoZeroIntegers_Test {

    @ParameterizedTest
    @ValueSource(ints = [2, 11])
    fun getNoZeroIntegers_Test1(n: Int) {
        assertThat(N1317_ConvertIntegerToTheSumOfTwoNoZeroIntegers().getNoZeroIntegers(n).toList())
            .hasSize(2)
            .allMatch { '0' !in it.toString() }
            .satisfies({ list -> assertThat(list.sum()).isEqualTo(n) })
    }

}