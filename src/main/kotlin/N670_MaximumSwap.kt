import kotlin.math.pow

class N670_MaximumSwap {
    fun maximumSwap(num: Int): Int {
        var swapNumber = -1
        var lastSwapInd = -1
        var lastSwapMax = -1
        var lastSwapMaxInd = -1
        var currMaxInd = 0
        var currMax = num % 10
        var currNum = num / 10
        var i = 1
        while (currNum != 0) {
            val digit = currNum % 10
            if (digit > currMax) {
                currMax = digit
                currMaxInd = i
            } else if (digit < currMax) {
                lastSwapInd = i
                swapNumber = digit
                lastSwapMaxInd = currMaxInd
                lastSwapMax = currMax
            }
            currNum /= 10
            ++i
        }
        return if (lastSwapInd == -1) num
        else num + (lastSwapMax - swapNumber) * (10.0.pow(lastSwapInd) - 10.0.pow(lastSwapMaxInd)).toInt()
    }
}