package string.SubstringsOfSizeThreeWithDistinctCharacters

object SubstringsOfSizeThreeWithDistinctCharacters {
    fun countGoodSubstrings(s: String): Int {
        var count = 0
        main@for ( i in 0 .. s.length-3 ){
            val temp = HashMap<Char,Boolean>()
            for ( j in i until  i +3 ) {
                if ( temp.containsKey( s[j] ) ) continue@main
                else temp.put( s[j] , true )
            }
            count++
        }
        return count
    }
}