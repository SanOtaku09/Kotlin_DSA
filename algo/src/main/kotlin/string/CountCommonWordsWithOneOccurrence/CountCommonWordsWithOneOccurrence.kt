package string.CountCommonWordsWithOneOccurrence

object CountCommonWordsWithOneOccurrence {
    fun countWords(words1: Array<String>, words2: Array<String>): Int {
        val map1 = HashMap<String,Boolean>()
        val map2 = HashMap<String,Boolean>()
        for ( i in words1 ) if ( map1.containsKey( i ) ) map1.put( i , false ) else map1.put( i , true )
        for ( i in words2 ) if ( map2.containsKey( i ) ) map2.put( i , false ) else map2.put( i , true )
        val smallArray = if ( words1.size < words2.size ) words1 else words2
        var count = 0
        for ( i in smallArray ) if ( map1[i] == true && map2[i] == true ) count++
        return count
    }
}