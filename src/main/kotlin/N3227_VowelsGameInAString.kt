class N3227_VowelsGameInAString {

    private val vowels = setOf('a', 'e', 'i', 'o', 'u')

    fun doesAliceWin(s: String): Boolean = s.any { it in vowels }

}