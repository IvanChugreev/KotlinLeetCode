import kotlin.math.abs

class N2762_ContinuousSubarrays {
    fun continuousSubarrays(nums: IntArray): Long {
        var left = 0
        var curMin = nums[0]
        var curMax = nums[0]
        var windowLen: Long
        var total = 0L
        nums.indices.forEach { right ->
            if (nums[right] < curMin) curMin = nums[right]
            if (nums[right] > curMax) curMax = nums[right]
            if (curMax - curMin > 2) {
                windowLen = (right - left).toLong()
                total += (windowLen * (windowLen + 1)) shr 1
                left = right
                curMax = nums[right]
                curMin = curMax
                while (left > 0 && abs(nums[right] - nums[left - 1]) <= 2) {
                    --left
                    if (nums[left] < curMin) curMin = nums[left]
                    if (nums[left] > curMax) curMax = nums[left]
                }
                if (left < right) {
                    windowLen = (right - left).toLong()
                    total -= (windowLen * (windowLen + 1)) shr 1
                }
            }
        }
        windowLen = (nums.size - left).toLong()
        return total + ((windowLen * (windowLen + 1)) shr 1)
    }
}