class N1106_ParsingABooleanExpression {
    fun parseBoolExpr(expression: String): Boolean {
        if (expression.length == 1) return expression == "t"
        val stack = ArrayDeque<Char>()
        var i = 0
        fun skip(result: Boolean) {
            var currentResult = result
            var skipBracket = 0
            while (stack.isNotEmpty()) {
                when (stack.last()) {
                    '!' -> currentResult = !currentResult
                    '&' -> if (currentResult) {
                        while (skipBracket > 0) {
                            ++i
                            if (expression[i] == ')') --skipBracket else if (expression[i] == '(') ++skipBracket
                        }
                        return
                    }

                    '|' -> if (!currentResult) {
                        while (skipBracket > 0) {
                            ++i
                            if (expression[i] == ')') --skipBracket else if (expression[i] == '(') ++skipBracket
                        }
                        return
                    }
                }
                ++skipBracket
                stack.removeLast()
            }
            i = expression.lastIndex
            stack.addLast(if (currentResult) 't' else 'f')
        }
        do {
            when (expression[i]) {
                ',', '(' -> {}
                't' -> if (stack.last() == '!' || stack.last() == '|') skip(true)
                'f' -> if (stack.last() == '!' || stack.last() == '&') skip(false)
                ')' -> if (stack.removeLast() == '&') skip(true) else skip(false)
                else -> stack.addLast(expression[i])
            }
            ++i
        } while (i < expression.length)
        return stack.last() == 't'
    }
}