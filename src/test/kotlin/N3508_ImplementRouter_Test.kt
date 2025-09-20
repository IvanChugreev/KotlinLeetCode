import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N3508_ImplementRouter_Test {

    @Test
    fun router_Test1() {
        val router = N3508_ImplementRouter.Router(3)
        val results = mutableListOf<Any?>()
        results += router.addPacket(1, 4, 90)
        results += router.addPacket(2, 5, 90)
        results += router.addPacket(1, 4, 90)
        results += router.addPacket(3, 5, 95)
        results += router.addPacket(4, 5, 105)
        results += router.forwardPacket()
        results += router.addPacket(5, 2, 110)
        results += router.getCount(5, 100, 110)
        assertThat(results).containsExactly(true, true, false, true, true, intArrayOf(2, 5, 90), true, 1)
    }

    @Test
    fun router_Test2() {
        val router = N3508_ImplementRouter.Router(2)
        val results = mutableListOf<Any?>()
        results += router.addPacket(7, 4, 90)
        results += router.forwardPacket()
        results += router.forwardPacket()
        assertThat(results).containsExactly(true, intArrayOf(7, 4, 90), intArrayOf())
    }

    @Test
    fun router_Test3() {
        val router = N3508_ImplementRouter.Router(2)
        val results = mutableListOf<Any?>()
        results += router.addPacket(3, 1, 3)
        results += router.addPacket(1, 2, 3)
        results += router.addPacket(4, 5, 3)
        results += router.getCount(1, 2, 3)
        assertThat(results).containsExactly(true, true, true, 0)
    }

    @Test
    fun router_Test4() {
        val router = N3508_ImplementRouter.Router(3)
        val results = mutableListOf<Any?>()
        results += router.addPacket(1, 4, 90)
        results += router.getCount(5, 100, 110)
        assertThat(results).containsExactly(true, 0)
    }
}