package string.ReverseWordsInAStringIII

object ReverseWordsInAStringIII {
    fun String.reverseWords(): String {
        val reversedString = StringBuilder()
        var tempStr = StringBuilder()
        for ( i in this ) {
            if ( i == ' ' && tempStr.length > 0 ) {
                reversedString.append( tempStr.reverse() )
                reversedString.append( " " )
                tempStr = StringBuilder()
            } else {
                tempStr.append( i )
            }
        }
        if ( tempStr.length > 0 ) reversedString.append( tempStr.reversed() )
        return reversedString.toString()
    }
}