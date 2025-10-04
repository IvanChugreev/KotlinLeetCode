class N11_ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex
        var maxArea = 0
        while (left < right) {
            val minHeight = minOf(height[left], height[right])
            maxArea = maxOf(maxArea, minHeight * (right - left))
            while (height[left] <= minHeight && left < right) {
                ++left
            }
            while (height[right] <= minHeight && left < right) {
                --right
            }
        }
        return maxArea
    }
}