import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import utils.ListNode

class N3217_DeleteNodesFromLinkedListPresentInArray_Test {

    @Test
    fun modifiedList_Test1() {
        val head = ListNode(intArrayOf(1, 2, 3, 4, 5))
        assertThat(N3217_DeleteNodesFromLinkedListPresentInArray().modifiedList(intArrayOf(1, 2, 3), head)!!.toList())
            .containsExactly(4, 5)
    }

    @Test
    fun modifiedList_Test2() {
        val head = ListNode(intArrayOf(1, 2, 1, 2, 1, 2))
        assertThat(N3217_DeleteNodesFromLinkedListPresentInArray().modifiedList(intArrayOf(1), head)!!.toList())
            .containsExactly(2, 2, 2)
    }

    @Test
    fun modifiedList_Test3() {
        val head = ListNode(intArrayOf(1, 2, 3, 4))
        assertThat(N3217_DeleteNodesFromLinkedListPresentInArray().modifiedList(intArrayOf(5), head)!!.toList())
            .containsExactly(1, 2, 3, 4)
    }

}