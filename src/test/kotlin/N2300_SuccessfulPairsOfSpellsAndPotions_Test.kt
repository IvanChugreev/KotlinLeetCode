import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2300_SuccessfulPairsOfSpellsAndPotions_Test {

    @Test
    fun successfulPairs_Test1() {
        val spells = intArrayOf(5, 1, 3)
        val potions = intArrayOf(1, 2, 3, 4, 5)
        assertThat(N2300_SuccessfulPairsOfSpellsAndPotions().successfulPairs(spells, potions, 7))
            .containsExactly(4, 0, 3)
    }

    @Test
    fun successfulPairs_Test2() {
        val spells = intArrayOf(3, 1, 2)
        val potions = intArrayOf(8, 5, 8)
        assertThat(N2300_SuccessfulPairsOfSpellsAndPotions().successfulPairs(spells, potions, 16))
            .containsExactly(2, 0, 2)
    }

    @Test
    fun successfulPairs_Test3() {
        val spells = intArrayOf(
            15, 39, 38, 35, 33, 25, 31, 12, 40, 27, 29, 16, 22, 24, 7, 36, 29, 34, 24, 9, 11, 35, 21, 3, 33, 10, 9, 27,
            35, 17, 14, 3, 35, 35, 39, 23, 35, 14, 31, 7
        )
        val potions = intArrayOf(
            25, 19, 30, 37, 14, 30, 38, 22, 38, 38, 26, 33, 34, 23, 40, 28, 15, 29, 36, 39, 39, 37, 32, 38, 8, 17, 39,
            20, 4, 39, 39, 7, 30, 35, 29, 23
        )
        assertThat(N2300_SuccessfulPairsOfSpellsAndPotions().successfulPairs(spells, potions, 317))
            .containsExactly(
                28, 33, 33, 33, 33, 33, 33, 23, 34, 33, 33, 29, 32, 33, 0, 33, 33, 33, 33, 13, 22, 33, 31, 0, 33, 17,
                13, 33, 33, 30, 27, 0, 33, 33, 33, 33, 33, 27, 33, 0
            )
    }

}