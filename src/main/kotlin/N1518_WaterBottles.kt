class N1518_WaterBottles {
    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
        var consumedBottles = 0
        var currNumBottles = numBottles
        while (currNumBottles >= numExchange) {
            val newBottles = currNumBottles / numExchange
            val emptyBottles = numExchange * newBottles
            consumedBottles += emptyBottles
            currNumBottles += newBottles - emptyBottles
        }
        return consumedBottles + currNumBottles
    }
}