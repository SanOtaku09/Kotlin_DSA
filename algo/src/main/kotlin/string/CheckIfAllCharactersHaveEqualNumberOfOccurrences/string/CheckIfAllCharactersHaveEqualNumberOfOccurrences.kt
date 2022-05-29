package string.CheckIfAllCharactersHaveEqualNumberOfOccurrences

object CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    fun String.areOccurrencesEqual(): Boolean {
        val map = HashMap<Char,Int>()
        for ( i in this ) {
            if ( map.containsKey( i ) ) map.set( i , map.get(i)!!+1  )
            else map.put( i , 1 )
        }
        val frequency = map.get( this[0] )
        for ( (k,v) in map ) {
            if ( v != frequency ) return false
        }
        return true
    }
}