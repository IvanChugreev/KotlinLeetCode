import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Condition
import org.junit.jupiter.api.Test
import java.util.Arrays
import java.util.stream.Collectors

class N2097_ValidArrangementOfPairs_Test {
    private data class Pair(val first: Int, val second: Int)

    private val validCondition = Condition<Array<IntArray>>({ pairs ->
        (1..<pairs.size).all { pairs[it][0] == pairs[it - 1][1] }
    }, "Valid array")

    private fun createContainsExactlyInAnyOrderCondition(values: Array<IntArray>): Condition<Array<IntArray>> {
        return Condition<Array<IntArray>>({ pairs ->
            if (pairs.size != values.size) return@Condition false
            val actual = Arrays.stream(pairs).collect(Collectors.toMap({ Pair(it[0], it[1]) }, { 1 }, Int::plus))
            val expected = Arrays.stream(values).collect(Collectors.toMap({ Pair(it[0], it[1]) }, { 1 }, Int::plus))
            if (actual.size != expected.size) return@Condition false
            expected.all { actual[it.key] == it.value }
        }, "Contains exactly in any order")
    }

    @Test
    fun validArrangement_Test1() {
        val pairs = arrayOf(intArrayOf(5, 1), intArrayOf(4, 5), intArrayOf(11, 9), intArrayOf(9, 4))
        assertThat(N2097_ValidArrangementOfPairs().validArrangement(pairs))
            .`is`(createContainsExactlyInAnyOrderCondition(pairs))
            .`is`(validCondition)
    }

    @Test
    fun validArrangement_Test2() {
        val pairs = arrayOf(intArrayOf(1, 3), intArrayOf(3, 2), intArrayOf(2, 1))
        assertThat(N2097_ValidArrangementOfPairs().validArrangement(pairs))
            .`is`(createContainsExactlyInAnyOrderCondition(pairs))
            .`is`(validCondition)
    }

    @Test
    fun validArrangement_Test3() {
        val pairs = arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 1))
        assertThat(N2097_ValidArrangementOfPairs().validArrangement(pairs))
            .`is`(createContainsExactlyInAnyOrderCondition(pairs))
            .`is`(validCondition)
    }
}