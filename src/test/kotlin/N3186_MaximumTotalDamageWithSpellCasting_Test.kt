import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3186_MaximumTotalDamageWithSpellCasting_Test {

    @Test
    fun maximumTotalDamage_Test1() {
        assertThat(N3186_MaximumTotalDamageWithSpellCasting().maximumTotalDamage(intArrayOf(1, 1, 3, 4)))
            .isEqualTo(6)
    }

    @Test
    fun maximumTotalDamage_Test2() {
        assertThat(N3186_MaximumTotalDamageWithSpellCasting().maximumTotalDamage(intArrayOf(7, 1, 6, 6)))
            .isEqualTo(13)
    }

}