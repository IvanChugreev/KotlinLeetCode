class N2_AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var p1 = l1
        var p2 = l2
        var carry = 0
        val dummyHead = ListNode(0)
        var current = dummyHead
        while (p1 != null || p2 != null || carry != 0) {
            val x = p1?.`val` ?: 0
            val y = p2?.`val` ?: 0
            var sum = x + y + carry
            if (sum > 9) {
                carry = 1
                sum -= 10
            } else carry = 0
            current.next = ListNode(sum)
            current = current.next!!
            p1 = p1?.next
            p2 = p2?.next
        }
        return dummyHead.next
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null

        constructor(arr: IntArray) : this(arr[0]) {
            var current: ListNode = this
            for (i in 1 until arr.size) {
                current.next = ListNode(arr[i])
                current = current.next!!
            }
        }

        fun contentToString(): String {
            val result = StringBuilder()
            result.append("[")

            var current: ListNode? = this
            while (current != null) {
                result.append(current.`val`)
                if (current.next != null) {
                    result.append(", ")
                }
                current = current.next
            }

            result.append("]")
            return result.toString()
        }
    }
}