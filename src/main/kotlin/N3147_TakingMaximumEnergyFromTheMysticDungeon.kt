class N3147_TakingMaximumEnergyFromTheMysticDungeon {
    fun maximumEnergy(energy: IntArray, k: Int): Int {
        for (i in k..<energy.size) {
            val prevIndex = i - k
            if (energy[prevIndex] > 0) {
                energy[i] += energy[prevIndex]
            }
        }
        return (energy.size - k..<energy.size).maxOf { energy[it] }
    }
}