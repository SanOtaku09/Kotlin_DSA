package string.OccurrencesAfterBigram

object OccurrencesAfterBigram {
    fun findOcurrences(text: String, first: String, second: String): Array<String> {
        val ans = ArrayList<String>( text.length )
        var counter = 0
        var indexes = IntArray(3){ 0 }
        var index = 1
        for ( i in 0 .. text.length ) {
            if ( counter < 2 && text[i] == ' ' ) {
                indexes[index++] = i
                counter++
            } else if ( i == text.length || text[i] == ' ' ) {
                if ( text.substring( indexes[0] , indexes[1] ) == first && text.substring( indexes[1]+1 , indexes[2] ) == second ) {
                    ans.add( text.substring( indexes[2]+1 , i ) )
                }
                indexes = intArrayOf( indexes[1]+1 , indexes[2] , i )
            }
        }
        return ans.toTypedArray()
    }
}