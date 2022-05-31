package string.ReplaceAllDigitsWithCharacters

object ReplaceAllDigitsWithCharacters {
    fun replaceDigits(s: String): String {
        val newString = StringBuilder()
        var i = 0
        while ( i < s.length ) {
            if ( s[i] !in '0' .. '9' ) newString.append( s[i] )
            else {
                val previous = i-1
                var gap = 0
                while ( i < s.length && s[i] in '0' .. '9' ) {
                    gap *= 10
                    gap += s[i++].toString().toInt()
                }
                newString.append( ( s[previous] + gap ).toChar() )
                i--
            }
            i++
        }
        return newString.toString()
    }
}