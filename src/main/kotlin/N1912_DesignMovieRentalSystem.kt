import java.util.TreeSet

class N1912_DesignMovieRentalSystem {
    class MovieRentingSystem(n: Int, entries: Array<IntArray>) {

        private data class Entry(val shop: Int, val movie: Int, val price: Int)

        private val entryByMovieByShop: MutableMap<Int, HashMap<Int, Entry>> = HashMap(n)
        private val unrentedEntriesByMovie: MutableMap<Int, TreeSet<Entry>> = HashMap()
        private val rentedEntries: TreeSet<Entry> = TreeSet(
            compareBy<Entry> { it.price }.thenBy { it.shop }.thenBy { it.movie }
        )

        init {
            for (arrEntry in entries) {
                val entry = Entry(arrEntry[0], arrEntry[1], arrEntry[2])
                entryByMovieByShop.computeIfAbsent(entry.shop) { HashMap() }[entry.movie] = entry
                unrentedEntriesByMovie.computeIfAbsent(entry.movie) {
                    TreeSet(compareBy<Entry> { it.price }.thenBy { it.shop })
                }.add(entry)
            }
        }

        fun search(movie: Int): List<Int> =
            unrentedEntriesByMovie[movie]?.asSequence()?.take(5)?.map { it.shop }?.toList() ?: emptyList()

        fun rent(shop: Int, movie: Int) {
            val rentedEntry = entryByMovieByShop[shop]!![movie]!!
            unrentedEntriesByMovie[movie]!!.remove(rentedEntry)
            rentedEntries.add(rentedEntry)
        }

        fun drop(shop: Int, movie: Int) {
            val unrentedEntry = entryByMovieByShop[shop]!![movie]!!
            rentedEntries.remove(unrentedEntry)
            unrentedEntriesByMovie[movie]!!.add(unrentedEntry)
        }

        fun report(): List<List<Int>> =
            rentedEntries.asSequence().take(5).map { listOf(it.shop, it.movie) }.toList()

    }
}