import java.util.TreeSet

class N3321_FindXSumOfAllKLongSubarrays2 {
    fun findXSum(nums: IntArray, k: Int, x: Int): LongArray {
        var sum = 0L
        val freqMap = mutableMapOf<Int, Int>()
        val comparator = compareBy<IntArray> { it[0] }.thenBy { it[1] }
        val top = TreeSet(comparator)
        val bot = TreeSet(comparator)
        val res = LongArray(nums.size - k + 1)
        for (num in nums) {
            freqMap[num] = 0
        }

        fun add(freq: Int, num: Int) {
            if (freq == 0) return
            val curr = intArrayOf(freq, num)
            if (top.size < x) {
                top.add(curr)
                sum += freq.toLong() * num
                return
            }
            val firstInTop = top.first()
            if (comparator.compare(curr, firstInTop) <= 0) {
                bot.add(curr)
            } else {
                sum -= firstInTop[0].toLong() * firstInTop[1]
                bot.add(firstInTop)
                top.pollFirst()
                top.add(curr)
                sum += freq.toLong() * num
            }
        }

        fun remove(freq: Int, num: Int) {
            if (freq == 0) return
            val curr = intArrayOf(freq, num)
            if (!bot.remove(curr) && top.remove(curr)) {
                sum -= freq.toLong() * num
                if (bot.isNotEmpty()) {
                    val lastInBot = bot.pollLast()!!
                    sum += lastInBot[0].toLong() * lastInBot[1]
                    top.add(lastInBot)
                }
            }
        }

        var l = 0
        var r = 0
        while (r < nums.size) {
            val currentNum = nums[r]
            val oldFreq = freqMap.getValue(currentNum)
            val newFreq = oldFreq + 1
            freqMap[currentNum] = newFreq
            remove(oldFreq, currentNum)
            add(newFreq, currentNum)
            if (r - l == k) {
                val leftNum = nums[l]
                val oldFreqLeft = freqMap.getValue(leftNum)
                val newFreqLeft = oldFreqLeft - 1
                freqMap[leftNum] = newFreqLeft
                remove(oldFreqLeft, leftNum)
                add(newFreqLeft, leftNum)
                ++l
            }
            if (r - l + 1 == k) {
                res[l] = sum
            }
            ++r
        }
        return res
    }
}