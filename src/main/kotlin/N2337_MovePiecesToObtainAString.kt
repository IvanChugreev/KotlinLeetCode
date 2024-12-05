class N2337_MovePiecesToObtainAString {
    fun canChange(start: String, target: String): Boolean {
        var j = 0
        target.forEachIndexed { i, char ->
            if (char == 'L') {
                while (j < start.length && start[j] == '_') ++j
                if (j < start.length && i <= j && start[j] == 'L') ++j else return false
            } else if (char == 'R') {
                while (j < start.length && start[j] == '_') ++j
                if (j < start.length && j <= i && start[j] == 'R') ++j else return false
            }
        }
        while (j < start.length) if (start[j++] != '_') return false
        return true
    }
}