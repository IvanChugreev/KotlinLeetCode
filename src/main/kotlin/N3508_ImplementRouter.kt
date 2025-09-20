import extensions.leftBinarySearch
import extensions.rightBinarySearch

class N3508_ImplementRouter {
    class Router(private val memoryLimit: Int) {

        private val query: ArrayDeque<Packet> = ArrayDeque(memoryLimit)
        private val packetSet: MutableSet<Packet> = HashSet()
        private val timestampByDestination: MutableMap<Int, ArrayDeque<Int>> = HashMap()

        fun addPacket(source: Int, destination: Int, timestamp: Int): Boolean {
            val packet = Packet(source, destination, timestamp)
            if (packet in packetSet) return false
            if (query.size == memoryLimit) {
                pollPacket()
            }
            query.add(packet)
            packetSet.add(packet)
            timestampByDestination.computeIfAbsent(destination) { ArrayDeque() }.add(timestamp)
            return true
        }

        fun forwardPacket(): IntArray = if (query.isEmpty()) intArrayOf() else pollPacket().toIntArray()

        fun getCount(destination: Int, startTime: Int, endTime: Int): Int {
            if (destination !in timestampByDestination) return 0
            val leftIndex = timestampByDestination[destination]!!.leftBinarySearch(startTime)
            val rightIndex = timestampByDestination[destination]!!.rightBinarySearch(endTime, leftIndex)
            return rightIndex - leftIndex
        }

        private fun pollPacket(): Packet {
            val packet = query.removeFirst()
            packetSet.remove(packet)
            timestampByDestination[packet.destination]!!.removeFirst()
            return packet
        }

        private data class Packet(
            val source: Int,
            val destination: Int,
            val time: Int
        ) {
            fun toIntArray(): IntArray = intArrayOf(source, destination, time)
        }
    }
}