import kotlin.math.abs

class N2463_MinimumTotalDistanceTraveled {
    fun minimumTotalDistance(robots: List<Int>, factories: Array<IntArray>): Long {
        val sortRobots = robots.sorted()
        factories.sortBy { it[0] }
        val factoryPositions = IntArray(factories.sumOf { it[1] })
        var ind = -1
        factories.forEach { factory -> repeat(factory[1]) { factoryPositions[++ind] = factory[0] } }
        var prev = LongArray(factoryPositions.size + 1)
        var current = LongArray(factoryPositions.size + 1)
        val robotsLastIndex = sortRobots.lastIndex
        current[factoryPositions.size] = 1000000000000L
        for (j in factoryPositions.lastIndex downTo 0) {
            current[j] = minOf(abs(sortRobots[robotsLastIndex] - factoryPositions[j]) + prev[j + 1], current[j + 1])
        }
        prev = current.also { current = prev }
        current[factoryPositions.size] = 1000000000000L
        val factoryPositionsRange = factoryPositions.lastIndex downTo 0
        for (i in robotsLastIndex - 1 downTo 0) {
            for (j in factoryPositionsRange) {
                current[j] = minOf(abs(sortRobots[i] - factoryPositions[j]) + prev[j + 1], current[j + 1])
            }
            prev = current.also { current = prev }
        }
        return prev[0]
    }
}