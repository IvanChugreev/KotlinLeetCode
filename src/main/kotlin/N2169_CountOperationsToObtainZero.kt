class N2169_CountOperationsToObtainZero {
    fun countOperations(num1: Int, num2: Int): Int {
        var currNum1 = num1
        var currNum2 = num2
        if (currNum1 < currNum2) {
            currNum1 = currNum2.also { currNum2 = currNum1 }
        }
        var result = 0
        while (currNum2 != 0) {
            result += currNum1 / currNum2
            currNum1 %= currNum2
            currNum1 = currNum2.also { currNum2 = currNum1 }
        }
        return result
    }
}