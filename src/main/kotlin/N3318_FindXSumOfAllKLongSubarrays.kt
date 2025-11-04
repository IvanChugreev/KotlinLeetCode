import java.util.TreeSet

class N3318_FindXSumOfAllKLongSubarrays {
    fun findXSum(nums: IntArray, k: Int, x: Int): IntArray {
        val ans = IntArray(nums.size - k + 1)
        val freq = mutableMapOf<Int, Int>()
        val sorted = TreeSet(compareByDescending<Pair<Int, Int>> { it.second }.thenByDescending { it.first })

        fun add(num: Int) {
            val oldFreq = freq[num] ?: 0
            if (oldFreq > 0) {
                sorted.remove(num to oldFreq)
            }
            val newFreq = oldFreq + 1
            freq[num] = newFreq
            sorted.add(num to newFreq)
        }

        fun remove(num: Int) {
            val oldFreq = freq[num] ?: return
            sorted.remove(num to oldFreq)
            if (oldFreq == 1) {
                freq.remove(num)
            } else {
                val newFreq = oldFreq - 1
                freq[num] = newFreq
                sorted.add(num to newFreq)
            }
        }

        fun computeXSum(): Int {
            var sum = 0
            var count = 0
            for ((num, f) in sorted) {
                sum += num * f
                if (++count == x) {
                    break
                }
            }
            return sum
        }

        for (i in 0 until k) {
            add(nums[i])
        }
        ans[0] = computeXSum()
        for (i in k until nums.size) {
            remove(nums[i - k])
            add(nums[i])
            ans[i - k + 1] = computeXSum()
        }
        return ans
    }
}