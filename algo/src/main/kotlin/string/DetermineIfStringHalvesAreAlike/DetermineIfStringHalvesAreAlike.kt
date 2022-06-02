package string.DetermineIfStringHalvesAreAlike

object DetermineIfStringHalvesAreAlike {
    val VOWEL = setOf( 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' )
    fun halvesAreAlike(s: String): Boolean {
        var leftHalve = 0 ; var rightHalve = 0
        for ( i in 0 until s.length/2 ) if ( VOWEL.contains( s[i] ) ) leftHalve++
        for ( i in s.length/2 until s.length ) if ( VOWEL.contains( s[i] ) ) rightHalve++
        return leftHalve == rightHalve
    }
}