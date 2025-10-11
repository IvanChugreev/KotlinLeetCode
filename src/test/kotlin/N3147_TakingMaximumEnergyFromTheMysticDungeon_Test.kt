import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3147_TakingMaximumEnergyFromTheMysticDungeon_Test {

    @Test
    fun maximumEnergy_Test1() {
        assertThat(N3147_TakingMaximumEnergyFromTheMysticDungeon().maximumEnergy(intArrayOf(5, 2, -10, -5, 1), 3))
            .isEqualTo(3)
    }

    @Test
    fun maximumEnergy_Test2() {
        assertThat(N3147_TakingMaximumEnergyFromTheMysticDungeon().maximumEnergy(intArrayOf(-2, -3, -1), 2))
            .isEqualTo(-1)
    }

}