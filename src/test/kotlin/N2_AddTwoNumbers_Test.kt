import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import utils.ListNode

class N2_AddTwoNumbers_Test {

    @Test
    fun addTwoNumbers_Test1() {
        val l1 = ListNode(intArrayOf(2, 4, 3))
        val l2 = ListNode(intArrayOf(5, 6, 4))
        assertThat(N2_AddTwoNumbers().addTwoNumbers(l1, l2)!!.toList()).containsExactly(7, 0, 8)
    }

    @Test
    fun addTwoNumbers_Test2() {
        assertThat(N2_AddTwoNumbers().addTwoNumbers(ListNode(0), ListNode(0))!!.toList()).containsExactly(0)
    }

    @Test
    fun addTwoNumbers_Test3() {
        val l1 = ListNode(intArrayOf(9, 9, 9, 9, 9, 9, 9))
        val l2 = ListNode(intArrayOf(9, 9, 9, 9))
        assertThat(N2_AddTwoNumbers().addTwoNumbers(l1, l2)!!.toList()).containsExactly(8, 9, 9, 9, 0, 0, 0, 1)
    }

}