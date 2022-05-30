package string.CountPrefixesOfAGivenString

object CountPrefixesOfAGivenString {
    fun countPrefixes(words: Array<String>, s: String): Int {
        var count = 0
        val len = s.length
        if ( len == 0 ) return count
        for ( i in words ){
            if ( i.length > len ) continue
            if ( i == s.substring( 0 , i.length ) ) count++
        }
        return count
    }
}