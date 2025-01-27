import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1462_CourseSchedule4_Test {

    @Test
    fun checkIfPrerequisite_Test1() {
        val queries = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0))
        assertThat(N1462_CourseSchedule4().checkIfPrerequisite(2, arrayOf(intArrayOf(1, 0)), queries))
            .containsExactly(false, true)
    }

    @Test
    fun checkIfPrerequisite_Test2() {
        val queries = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))
        assertThat(N1462_CourseSchedule4().checkIfPrerequisite(2, arrayOf(), queries))
            .containsExactly(false, false)
    }

    @Test
    fun checkIfPrerequisite_Test3() {
        val prerequisites = arrayOf(intArrayOf(1, 2), intArrayOf(1, 0), intArrayOf(2, 0))
        val queries = arrayOf(intArrayOf(1, 0), intArrayOf(1, 2))
        assertThat(N1462_CourseSchedule4().checkIfPrerequisite(3, prerequisites, queries))
            .containsExactly(true, true)
    }
}