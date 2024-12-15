import java.util.PriorityQueue

class N1792_MaximumAveragePassRatio {
    fun maxAverageRatio(classes: Array<IntArray>, extraStudents: Int): Double {
        fun calculateGain(passes: Double, totalStudents: Double): Double =
            ((passes + 1) / (totalStudents + 1) - passes / totalStudents)

        val maxHeap = PriorityQueue { a: DoubleArray, b: DoubleArray -> b[0].compareTo(a[0]) }
        classes.forEach {
            val passes = it[0].toDouble()
            val totalStudents = it[1].toDouble()
            maxHeap.offer(doubleArrayOf(calculateGain(passes, totalStudents), passes, totalStudents))
        }
        var extraStudentsCount = extraStudents
        while (extraStudentsCount-- > 0) {
            val current = maxHeap.poll()
            val passes = current[1] + 1
            val totalStudents = current[2] + 1
            maxHeap.offer(doubleArrayOf(calculateGain(passes, totalStudents), passes, totalStudents))
        }
        var totalPassRatio = 0.0
        while (maxHeap.isNotEmpty()) {
            val current = maxHeap.poll()
            totalPassRatio += current[1] / current[2]
        }
        return totalPassRatio / classes.size
    }
}