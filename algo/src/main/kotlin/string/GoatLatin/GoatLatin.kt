package string.GoatLatin

object GoatLatin {
    val VOWEL = HashSet<Char>( listOf( 'a' , 'e' , 'i' , 'o' , 'u' , 'A' , 'E' , 'I' , 'O' , 'U' ) )
    fun toGoatLatin(sentence: String): String {
        val ans = StringBuilder()
        var a_count = 2
        var i = 0
        while ( i < sentence.length ) {
            if ( sentence[i] in VOWEL ) {
                while ( i < sentence.length && sentence[i] != ' ' ) ans.append( sentence[i++] )
                ans.append( 'm' )
                repeat( a_count ) {
                    ans.append( 'a' )
                }
                a_count++
                if ( i < sentence.length ) ans.append( ' ' )
            } else {
                val preserved = sentence[i++]
                while ( i < sentence.length && sentence[i] != ' ' ) ans.append( sentence[i++] )
                ans.append( preserved )
                ans.append( 'm' )
                repeat( a_count ) { ans.append( 'a' ) }
                a_count++
                if ( i < sentence.length ) ans.append( ' ' )
            }
            i++
        }
        return ans.toString()
    }
}