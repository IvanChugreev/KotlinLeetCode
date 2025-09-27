import kotlin.math.abs
import kotlin.math.max

class N812_LargestTriangleArea {

    fun largestTriangleArea(points: Array<IntArray>): Double {
        val n = points.size
        var ans = 0.0
        for (i in 0..<n) for (j in i + 1..<n) for (k in j + 1..<n) {
            ans = max(ans, area(points[i], points[j], points[k]))
        }
        return ans
    }

    private fun area(point1: IntArray, point2: IntArray, point3: IntArray): Double =
        0.5 * abs(
            point1[0] * point2[1] + point2[0] * point3[1] + point3[0] * point1[1]
                    - point1[1] * point2[0] - point2[1] * point3[0] - point3[1] * point1[0]
        )

}