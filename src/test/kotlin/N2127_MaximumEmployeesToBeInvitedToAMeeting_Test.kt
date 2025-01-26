import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2127_MaximumEmployeesToBeInvitedToAMeeting_Test {

    @Test
    fun maximumInvitations_Test1() {
        assertThat(N2127_MaximumEmployeesToBeInvitedToAMeeting().maximumInvitations(intArrayOf(2, 2, 1, 2)))
            .isEqualTo(3)
    }

    @Test
    fun maximumInvitations_Test2() {
        assertThat(N2127_MaximumEmployeesToBeInvitedToAMeeting().maximumInvitations(intArrayOf(1, 2, 0)))
            .isEqualTo(3)
    }

    @Test
    fun maximumInvitations_Test3() {
        assertThat(N2127_MaximumEmployeesToBeInvitedToAMeeting().maximumInvitations(intArrayOf(3, 0, 1, 4, 1)))
            .isEqualTo(4)
    }
}