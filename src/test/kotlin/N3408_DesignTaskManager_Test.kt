import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3408_DesignTaskManager_Test {

    @Test
    fun taskManager_Test1() {
        val tasks = listOf(listOf(1, 101, 10), listOf(2, 102, 20), listOf(3, 103, 15))
        val taskManager = N3408_DesignTaskManager.TaskManager(tasks)
        val results = mutableListOf<Int?>()
        taskManager.add(4, 104, 5)
        taskManager.edit(102, 8)
        results += taskManager.execTop()
        taskManager.rmv(101)
        taskManager.add(5, 105, 15)
        results += taskManager.execTop()
        assertThat(results).containsExactly(3, 5)
    }

}