package string.CountingWordsWithAGivenPrefix

object CountingWordsWithAGivenPrefix {
    fun String.prefixCount( words: Array<String> ): Int {
        var count = 0
        for ( i in words ) if ( i.indexOf( this ) == 0 ) count++
        return count
    }
}