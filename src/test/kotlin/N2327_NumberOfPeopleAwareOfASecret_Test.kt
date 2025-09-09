import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2327_NumberOfPeopleAwareOfASecret_Test {

    @Test
    fun peopleAwareOfSecret_Test1() {
        assertThat(N2327_NumberOfPeopleAwareOfASecret().peopleAwareOfSecret(6, 2, 4)).isEqualTo(5)
    }

    @Test
    fun peopleAwareOfSecret_Test2() {
        assertThat(N2327_NumberOfPeopleAwareOfASecret().peopleAwareOfSecret(4, 1, 3)).isEqualTo(6)
    }

}