package string.UncommonWordsfromTwoSentences

object UncommonWordsfromTwoSentences {
    fun uncommonFromSentences(s1: String, s2: String): Array<String> {
        val word = HashMap<String,Int>()
        var index = 0
        while ( index < s1.length ) {
            val start = index
            while ( index < s1.length && s1[index] != ' ' ) index++
            s1.substring( start , index ).run {
                if ( word.containsKey(  this) ) word.put( this , word[this]!!+1 )
                else word.put( this , 1 )
            }
            index++
        }
        index = 0
        while ( index < s2.length ) {
            val start = index
            while ( index < s2.length && s2[index] != ' ' ) index++
            s2.substring( start , index ).run {
                if ( word.containsKey(  this) ) word.put( this , word[this]!!+1 )
                else word.put( this , 1 )
            }
            index++
        }
        val arrayList = ArrayList<String>( word.size )
        for ( ( k , v ) in word ) if ( v == 1 ) arrayList.add( k )
        return arrayList.toTypedArray()
    }
}