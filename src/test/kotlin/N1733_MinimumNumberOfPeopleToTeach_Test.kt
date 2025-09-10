import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1733_MinimumNumberOfPeopleToTeach_Test {

    @Test
    fun minimumTeachings_Test1() {
        val languages = arrayOf(intArrayOf(1), intArrayOf(2), intArrayOf(1, 2))
        val friendships = arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 3))
        assertThat(N1733_MinimumNumberOfPeopleToTeach().minimumTeachings(2, languages, friendships)).isEqualTo(1)
    }

    @Test
    fun minimumTeachings_Test2() {
        val languages = arrayOf(intArrayOf(2), intArrayOf(1, 3), intArrayOf(1, 2), intArrayOf(3))
        val friendships = arrayOf(intArrayOf(1, 4), intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(2, 3))
        assertThat(N1733_MinimumNumberOfPeopleToTeach().minimumTeachings(3, languages, friendships)).isEqualTo(2)
    }

}