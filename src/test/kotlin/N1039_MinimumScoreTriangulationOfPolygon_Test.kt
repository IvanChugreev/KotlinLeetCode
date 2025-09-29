import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1039_MinimumScoreTriangulationOfPolygon_Test {

    @Test
    fun minScoreTriangulation_Test1() {
        assertThat(N1039_MinimumScoreTriangulationOfPolygon().minScoreTriangulation(intArrayOf(1, 2, 3)))
            .isEqualTo(6)
    }

    @Test
    fun minScoreTriangulation_Test2() {
        assertThat(N1039_MinimumScoreTriangulationOfPolygon().minScoreTriangulation(intArrayOf(3, 7, 4, 5)))
            .isEqualTo(144)
    }

    @Test
    fun minScoreTriangulation_Test3() {
        assertThat(N1039_MinimumScoreTriangulationOfPolygon().minScoreTriangulation(intArrayOf(1, 3, 1, 4, 1, 5)))
            .isEqualTo(13)
    }

}