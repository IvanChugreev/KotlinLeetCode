import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.data.Index
import org.junit.jupiter.api.Test

class N1861_RotatingTheBox_Test {

    @Test
    fun rotateTheBox_Test1() {
        val box = arrayOf(charArrayOf('#', '.', '#'))
        assertThat(N1861_RotatingTheBox().rotateTheBox(box))
            .contains(charArrayOf('.'), Index.atIndex(0))
            .contains(charArrayOf('#'), Index.atIndex(1))
            .contains(charArrayOf('#'), Index.atIndex(2))
    }

    @Test
    fun rotateTheBox_Test2() {
        val box = arrayOf(charArrayOf('#', '.', '*', '.'), charArrayOf('#', '#', '*', '.'))
        assertThat(N1861_RotatingTheBox().rotateTheBox(box))
            .contains(charArrayOf('#', '.'), Index.atIndex(0))
            .contains(charArrayOf('#', '#'), Index.atIndex(1))
            .contains(charArrayOf('*', '*'), Index.atIndex(2))
            .contains(charArrayOf('.', '.'), Index.atIndex(3))
    }

    @Test
    fun rotateTheBox_Test3() {
        val box = arrayOf(
            charArrayOf('#', '#', '*', '.', '*', '.'),
            charArrayOf('#', '#', '#', '*', '.', '.'),
            charArrayOf('#', '#', '#', '.', '#', '.')
        )
        assertThat(N1861_RotatingTheBox().rotateTheBox(box))
            .contains(charArrayOf('.', '#', '#'), Index.atIndex(0))
            .contains(charArrayOf('.', '#', '#'), Index.atIndex(1))
            .contains(charArrayOf('#', '#', '*'), Index.atIndex(2))
            .contains(charArrayOf('#', '*', '.'), Index.atIndex(3))
            .contains(charArrayOf('#', '.', '*'), Index.atIndex(4))
            .contains(charArrayOf('#', '.', '.'), Index.atIndex(5))
    }
}