class N1462_CourseSchedule4 {
    fun checkIfPrerequisite(numCourses: Int, prerequisites: Array<IntArray>, queries: Array<IntArray>): List<Boolean> {
        val isPrerequisite = Array(numCourses) { BooleanArray(numCourses) }
        prerequisites.forEach { isPrerequisite[it[0]][it[1]] = true }
        repeat(numCourses) { intermediate ->
            repeat(numCourses) { src ->
                repeat(numCourses) { target ->
                    isPrerequisite[src][target] = isPrerequisite[src][target] ||
                            (isPrerequisite[src][intermediate] && isPrerequisite[intermediate][target])
                }
            }
        }
        return queries.map { isPrerequisite[it[0]][it[1]] }
    }
}