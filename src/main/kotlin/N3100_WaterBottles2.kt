import kotlin.math.ceil
import kotlin.math.sqrt

class N3100_WaterBottles2 {
    fun maxBottlesDrunk(numBottles: Int, numExchange: Int): Int {
        val b = (numExchange shl 1) - 3
        val c = -(numBottles shl 1)
        val t = ceil((-b + sqrt((b * b - (c shl 2)).toDouble())) / 2).toInt()
        return numBottles + t - 1
    }
}