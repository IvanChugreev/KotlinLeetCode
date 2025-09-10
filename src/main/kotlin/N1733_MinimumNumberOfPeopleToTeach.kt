class N1733_MinimumNumberOfPeopleToTeach {
    fun minimumTeachings(n: Int, languages: Array<IntArray>, friendships: Array<IntArray>): Int {
        val langSetsCache = Array<Set<Int>?>(languages.size + 1) { null }
        val peopleToLearnNewLanguage = HashSet<Int>()
        friendships.forEach {
            if (langSetsCache[it[0]] == null) {
                langSetsCache[it[0]] = languages[it[0] - 1].toSet()
            }
            val currLangSet = langSetsCache[it[0]]!!
            if (languages[it[1] - 1].none { lang -> lang in currLangSet }) {
                peopleToLearnNewLanguage.add(it[0])
                peopleToLearnNewLanguage.add(it[1])
            }
        }
        val langCounters = IntArray(n + 1)
        peopleToLearnNewLanguage.forEach { languages[it - 1].forEach { lang -> ++langCounters[lang] } }
        return peopleToLearnNewLanguage.size - langCounters.max()
    }
}