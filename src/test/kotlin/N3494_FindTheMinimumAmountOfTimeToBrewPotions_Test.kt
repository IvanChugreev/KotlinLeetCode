import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3494_FindTheMinimumAmountOfTimeToBrewPotions_Test {

    @Test
    fun minTime_Test1() {
        val skill = intArrayOf(1, 5, 2, 4)
        val mana = intArrayOf(5, 1, 4, 2)
        assertThat(N3494_FindTheMinimumAmountOfTimeToBrewPotions().minTime(skill, mana)).isEqualTo(110)
    }

    @Test
    fun minTime_Test2() {
        val skill = intArrayOf(1, 1, 1)
        val mana = intArrayOf(1, 1, 1)
        assertThat(N3494_FindTheMinimumAmountOfTimeToBrewPotions().minTime(skill, mana)).isEqualTo(5)
    }

    @Test
    fun minTime_Test3() {
        val skill = intArrayOf(1, 2, 3, 4)
        val mana = intArrayOf(1, 2)
        assertThat(N3494_FindTheMinimumAmountOfTimeToBrewPotions().minTime(skill, mana)).isEqualTo(21)
    }

}