package string.FindCommonCharacters

object FindCommonCharacters {
    fun commonChars(words: Array<String>): List<String> {
        if ( words.size < 1 ) return List(0){""}
        else if ( words.size == 1 ) List<String>( words[0].length ){ words[0][it].toString() }
        val ans = ArrayList<String>( words[0].length )
        var primary = HashMap<Char,Int>()
        for ( i in words[0] ) if ( primary.containsKey( i ) ) primary.put( i , primary.getValue(i)+1 ) else primary.put( i , 1 )
        for ( i in 1 until words.size ) {
            val secondary = HashMap<Char,Int>()
            for ( j in words[i] ) {
                if ( primary.containsKey( j ) ) {
                    if ( !secondary.containsKey( j ) ) secondary.put( j , 1 )
                    else if ( primary[j]!! > secondary[j]!! ) secondary.put( j , secondary.getValue( j ) + 1 )
                }
            }
            primary = secondary
        }
        for ( ( k , v ) in primary ) {
            repeat( v ) {
                ans.add( k.toString() )
            }
        }
        return ans
    }
}