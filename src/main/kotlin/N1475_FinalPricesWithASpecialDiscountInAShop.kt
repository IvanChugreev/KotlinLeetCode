import java.util.Stack

class N1475_FinalPricesWithASpecialDiscountInAShop {
    fun finalPrices(prices: IntArray): IntArray {
        val stack = Stack<Int>()
        stack.push(0)
        (1..<prices.size).forEach {
            while (stack.isNotEmpty() && prices[stack.peek()] >= prices[it]) prices[stack.pop()] -= prices[it]
            stack.push(it)
        }
        return prices
    }
}