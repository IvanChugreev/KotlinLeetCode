import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2125_NumberOfLaserBeamsInABank_Test {

    @Test
    fun numberOfBeams_Test1() {
        assertThat(N2125_NumberOfLaserBeamsInABank().numberOfBeams(arrayOf("011001", "000000", "010100", "001000")))
            .isEqualTo(8)
    }

    @Test
    fun numberOfBeams_Test2() {
        assertThat(N2125_NumberOfLaserBeamsInABank().numberOfBeams(arrayOf("000", "111", "000"))).isEqualTo(0)
    }

}