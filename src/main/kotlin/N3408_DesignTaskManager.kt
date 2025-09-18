import utils.PriorityQueueWithBulkInitBuilder
import java.util.PriorityQueue

class N3408_DesignTaskManager {
    class TaskManager(tasks: List<List<Int>>) {

        private val priorityTaskQueue: PriorityQueue<IntArray> =
            PriorityQueueWithBulkInitBuilder.buildPriorityQueueWithBulkInit(
                tasks.map { intArrayOf(it[2], it[1]) },
                compareByDescending<IntArray> { it[0] }.thenByDescending { it[1] }
            )
        private val priorityByTaskId: MutableMap<Int, Int> = HashMap()
        private val userIdByTaskId: MutableMap<Int, Int> = HashMap()

        init {
            for (task in tasks) {
                priorityByTaskId[task[1]] = task[2]
                userIdByTaskId[task[1]] = task[0]
            }
        }

        fun add(userId: Int, taskId: Int, priority: Int) {
            priorityTaskQueue.add(intArrayOf(priority, taskId))
            priorityByTaskId[taskId] = priority
            userIdByTaskId[taskId] = userId
        }

        fun edit(taskId: Int, newPriority: Int) {
            priorityTaskQueue.add(intArrayOf(newPriority, taskId))
            priorityByTaskId[taskId] = newPriority
        }

        fun rmv(taskId: Int) {
            priorityByTaskId.remove(taskId)
            userIdByTaskId.remove(taskId)
        }

        fun execTop(): Int {
            while (priorityTaskQueue.isNotEmpty()) {
                val (priority, taskId) = priorityTaskQueue.poll()
                if (priorityByTaskId.getOrDefault(taskId, -1) == priority) {
                    priorityByTaskId.remove(taskId)
                    return userIdByTaskId.remove(taskId)!!
                }
            }
            return -1
        }
    }
}