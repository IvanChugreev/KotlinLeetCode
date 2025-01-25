import java.util.LinkedList
import kotlin.math.abs

class N2948_MakeLexicographicallySmallestArrayBySwappingElements {
    fun lexicographicallySmallestArray(nums: IntArray, limit: Int): IntArray {
        val numsSorted = nums.sortedArray()
        var currGroup = 0
        val numToGroup = HashMap<Int, Int>()
        numToGroup[numsSorted[0]] = 0
        val groupToList = HashMap<Int, LinkedList<Int>>()
        groupToList[currGroup] = LinkedList<Int>().also { it.add(numsSorted[0]) }
        (1..<nums.size).forEach {
            if (abs(numsSorted[it] - numsSorted[it - 1]) > limit) ++currGroup
            numToGroup[numsSorted[it]] = currGroup
            groupToList.computeIfAbsent(currGroup) { LinkedList() }.add(numsSorted[it])
        }
        nums.indices.forEach { nums[it] = groupToList[numToGroup[nums[it]]]!!.pop() }
        return nums
    }
}