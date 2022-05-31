package string.MergeStringsAlternately

object MergeStringsAlternately {
    fun mergeAlternately(word1: String, word2: String): String {
        val string = StringBuilder()
        var i = 0 ; var j = 0
        while ( i < word1.length || j < word2.length ) {
            if ( i < word1.length ) string.append( word1[i++] )
            if ( j < word2.length ) string.append( word2[j++] )
        }
        return string.toString()
    }
}