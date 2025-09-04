import kotlin.math.abs

class N3516_FindClosestPerson {
    fun findClosest(x: Int, y: Int, z: Int): Int {
        val diff = abs(z - x) - abs(z - y)
        return when {
            diff > 0 -> 2
            diff < 0 -> 1
            else -> 0
        }
    }
}