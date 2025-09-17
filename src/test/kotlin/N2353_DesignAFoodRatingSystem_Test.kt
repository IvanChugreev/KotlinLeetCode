import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2353_DesignAFoodRatingSystem_Test_Test {

    @Test
    fun foodRatings_Test1() {
        val foods = arrayOf("kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi")
        val cuisines = arrayOf("korean", "japanese", "japanese", "greek", "japanese", "korean")
        val ratings = intArrayOf(9, 12, 8, 15, 14, 7)
        val foodRatings = N2353_DesignAFoodRatingSystem.FoodRatings(foods, cuisines, ratings)
        val results = mutableListOf<String?>()
        results += foodRatings.highestRated("korean")
        results += foodRatings.highestRated("japanese")
        foodRatings.changeRating("sushi", 16)
        results += foodRatings.highestRated("japanese")
        foodRatings.changeRating("ramen", 16)
        results += foodRatings.highestRated("japanese")
        assertThat(results).containsExactly("kimchi", "ramen", "sushi", "ramen")
    }
}