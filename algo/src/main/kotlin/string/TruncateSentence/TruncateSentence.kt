package string.TruncateSentence

object TruncateSentence {
    fun truncateSentence(s: String, k: Int): String {
        val string = StringBuilder()
        var count = 0
        for ( i in s ) {
            if ( i == ' ' ) count++
            if ( count == k ) break
            string.append( i )
        }
        return string.toString()
    }
}