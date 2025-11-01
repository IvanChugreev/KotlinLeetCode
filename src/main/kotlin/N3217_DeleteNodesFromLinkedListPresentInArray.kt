import utils.ListNode

class N3217_DeleteNodesFromLinkedListPresentInArray {
    fun modifiedList(nums: IntArray, head: ListNode?): ListNode? {
        val numsSet = nums.toSet()
        val pseudoHead = ListNode(0)
        pseudoHead.next = head
        var currNode: ListNode? = pseudoHead
        while (currNode != null) {
            val next = currNode.next
            if (next != null && next.`val` in numsSet) {
                currNode.next = next.next
            } else {
                currNode = next
            }
        }
        return pseudoHead.next
    }
}