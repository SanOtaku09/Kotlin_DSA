package string.NumberOfDifferentIntegersInAString

object NumberOfDifferentIntegersInAString {
    fun numDifferentIntegers(word: String): Int {
        val unique = HashSet<String>()
        val temp = StringBuilder()
        for ( i in 0 .. word.length ) {
            if ( ( i == word.length || word[i] !in '0' .. '9' ) && temp.length > 0 ) {
                if ( temp.matches( "0+".toRegex() ) ) unique.add( "0" )
                else if ( temp.matches( "0+\\d+".toRegex() ) ) {
                    var start = 0
                    while ( temp[start] == '0' ) start++
                    unique.add( temp.substring( start ) )
                    temp.clear()
                } else unique.add( temp.toString() )
                temp.clear()
            } else if ( i != word.length && word[i] in '0' .. '9' ) {
                temp.append( word[i] )
            }
        }
        return unique.size
    }
}