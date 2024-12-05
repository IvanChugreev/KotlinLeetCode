import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2337_MovePiecesToObtainAString_Test {

    @Test
    fun canChange_Test1() {
        assertThat(N2337_MovePiecesToObtainAString().canChange("_L__R__R_", "L______RR")).isTrue()
    }

    @Test
    fun canChange_Test2() {
        assertThat(N2337_MovePiecesToObtainAString().canChange("R_L_", "__LR")).isFalse()
    }

    @Test
    fun canChange_Test3() {
        assertThat(N2337_MovePiecesToObtainAString().canChange("_R", "R_")).isFalse()
    }

    @Test
    fun canChange_Test4() {
        assertThat(N2337_MovePiecesToObtainAString().canChange("_LL__R__R_", "L___L___RR")).isFalse()
    }
}