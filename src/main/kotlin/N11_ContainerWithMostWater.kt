class N11_ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex
        var maxArea = 0
        var lastMax: Int
        while (left < right) {
            maxArea = maxOf(maxArea, minOf(height[left], height[right]) * (right - left))
            if (height[left] < height[right]) {
                lastMax = height[left++]
                while (left < height.size && lastMax >= height[left]) ++left
            } else {
                lastMax = height[right--]
                while (right > -1 && lastMax >= height[right]) --right
            }
        }
        return maxArea
    }
}