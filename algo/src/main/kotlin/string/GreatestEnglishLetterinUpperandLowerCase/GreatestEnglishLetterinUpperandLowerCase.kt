package string.GreatestEnglishLetterinUpperandLowerCase
object GreatestEnglishLetterinUpperandLowerCase {
    fun greatestLetter(s: String): String {
        val set = HashSet<Char>()
        for ( i in s ) set.add( i )
        for ( i in 'Z' downTo 'A' ) {
            if ( set.contains( i ) && set.contains( ( ( i - 'A' ) + 'a'.code ).toChar() ) ) {
                return "$i"
            }
        }
        return ""
    }
}