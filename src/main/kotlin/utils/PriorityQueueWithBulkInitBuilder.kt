package utils

import java.util.PriorityQueue

/**
 * Класс-костыль для инициализации PriorityQueue с кастомным компаратором за O(N).
 */
class PriorityQueueWithBulkInitBuilder<T> private constructor(
    private val elements: Collection<T>,
    comparator: Comparator<T>
) : PriorityQueue<T>(comparator) {

    companion object {
        fun <T> buildPriorityQueueWithBulkInit(elements: Collection<T>, comparator: Comparator<T>): PriorityQueue<T> {
            return PriorityQueue(PriorityQueueWithBulkInitBuilder(elements, comparator))
        }
    }

    override fun toArray(): Array<Any> {
        val array = Array<Any?>(elements.size) { null }
        var index = 0
        for (element in elements) {
            array[index++] = element
        }
        @Suppress("UNCHECKED_CAST")
        return array as Array<Any>
    }
}