package utils

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    constructor(arr: IntArray) : this(arr[0]) {
        var current: ListNode = this
        for (i in 1 until arr.size) {
            current.next = ListNode(arr[i])
            current = current.next!!
        }
    }

    fun toList(): List<Int> {
        val list = ArrayList<Int>()
        var currNode: ListNode? = this
        while (currNode != null) {
            list.add(currNode.`val`)
            currNode = currNode.next
        }
        return list
    }
}