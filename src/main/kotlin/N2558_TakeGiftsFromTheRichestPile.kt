import java.util.PriorityQueue
import kotlin.math.sqrt

class N2558_TakeGiftsFromTheRichestPile {
    fun pickGifts(gifts: IntArray, k: Int): Long {
        val minusGifts = ArrayList<Int>(gifts.size)
        gifts.forEach { minusGifts.add(-it) }
        val giftsHeap = PriorityQueue(minusGifts)
        repeat(k) { giftsHeap.add((-sqrt(-giftsHeap.poll().toDouble())).toInt()) }
        return giftsHeap.fold(0L) { acc, i -> acc - i }
    }
}