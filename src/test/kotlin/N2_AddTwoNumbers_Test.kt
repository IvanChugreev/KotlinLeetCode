import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2_AddTwoNumbers_Test {

    @Test
    fun addTwoNumbers_Test1() {
        val l1 = N2_AddTwoNumbers.ListNode(intArrayOf(2, 4, 3))
        val l2 = N2_AddTwoNumbers.ListNode(intArrayOf(5, 6, 4))
        assertThat(N2_AddTwoNumbers().addTwoNumbers(l1, l2)!!.contentToString()).isEqualTo("[7, 0, 8]")
    }
}