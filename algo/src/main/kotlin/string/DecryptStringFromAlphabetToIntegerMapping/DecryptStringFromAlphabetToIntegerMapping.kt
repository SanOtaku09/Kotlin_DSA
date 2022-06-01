package string.DecryptStringFromAlphabetToIntegerMapping

object DecryptStringFromAlphabetToIntegerMapping {
    fun freqAlphabets(s: String): String {
        val newString = StringBuilder()
        var i = 0
        while ( i < s.length ) {
            if ( i+2 < s.length && s[i+2] == '#' ){
                var temp = 0
                while ( i < s.length && s[i] != '#' ) {
                    temp *= 10
                    temp += s[i++].toString().toInt()
                }
                newString.append( ( temp + 'a'.code -1 ).toChar() )
            } else newString.append( (s[i].toString().toInt()-1+'a'.code).toChar() )
            i++
        }
        return newString.toString()
    }
}