import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1912_DesignMovieRentalSystem_Test {

    @Test
    fun movieRentingSystem_Test1() {
        val entries = arrayOf(
            intArrayOf(0, 1, 5),
            intArrayOf(0, 2, 6),
            intArrayOf(0, 3, 7),
            intArrayOf(1, 1, 4),
            intArrayOf(1, 2, 7),
            intArrayOf(2, 1, 5)
        )
        val movieRentalSystem = N1912_DesignMovieRentalSystem.MovieRentingSystem(3, entries)
        val result = mutableListOf<Any?>()
        result.add(movieRentalSystem.search(1))
        movieRentalSystem.rent(0, 1)
        movieRentalSystem.rent(1, 2)
        result.add(movieRentalSystem.report())
        movieRentalSystem.drop(1, 2)
        result.add(movieRentalSystem.search(2))
        assertThat(result).containsExactly(listOf(1, 0, 2), listOf(listOf(0, 1), listOf(1, 2)), listOf(0, 1))
    }

}