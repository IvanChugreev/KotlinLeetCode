package extensions

private fun <T> List<T>.binarySearchByPredicate(
    target: T,
    start: Int = 0,
    end: Int = size,
    comparator: Comparator<T>,
    predicate: (Int) -> Boolean
): Int {
    var left = start
    var right = end
    while (left < right) {
        val mid = (left + right) ushr 1
        val cmp = comparator.compare(get(mid), target)
        if (predicate(cmp)) {
            left = mid + 1
        } else {
            right = mid
        }
    }
    return left
}

fun <T : Comparable<T>> List<T>.leftBinarySearch(
    target: T,
    start: Int = 0,
    end: Int = size,
): Int = binarySearchByPredicate(target, start, end, Comparator.naturalOrder<T>()) { cmp -> cmp < 0 }

fun <T : Comparable<T>> List<T>.rightBinarySearch(
    target: T,
    start: Int = 0,
    end: Int = size,
): Int = binarySearchByPredicate(target, start, end, Comparator.naturalOrder<T>()) { cmp -> cmp <= 0 }
