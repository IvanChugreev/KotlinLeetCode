import java.util.TreeSet

class N2353_DesignAFoodRatingSystem {

    class FoodRatings(foods: Array<String>, cuisines: Array<String>, ratings: IntArray) {

        private val foodRatingMap = mutableMapOf<String, Int>()
        private val foodCuisineMap = mutableMapOf<String, String>()
        private val cuisineFoodMap = mutableMapOf<String, TreeSet<Pair<Int, String>>>()

        init {
            for (i in foods.indices) {
                val food = foods[i]
                val cuisine = cuisines[i]
                val rating = ratings[i]
                foodRatingMap[food] = rating
                foodCuisineMap[food] = cuisine
                val set = cuisineFoodMap.computeIfAbsent(cuisine) {
                    TreeSet<Pair<Int, String>>(
                        compareBy<Pair<Int, String>> { it.first }.thenBy { it.second }
                    )
                }
                set.add(-rating to food)
            }
        }

        fun changeRating(food: String, newRating: Int) {
            val cuisineName = foodCuisineMap[food] ?: return
            val cuisineSet = cuisineFoodMap[cuisineName] ?: return
            val oldElement = -foodRatingMap[food]!! to food
            cuisineSet.remove(oldElement)
            foodRatingMap[food] = newRating
            cuisineSet.add(-newRating to food)
        }

        fun highestRated(cuisine: String): String = cuisineFoodMap[cuisine]!!.first().second

    }

}