package string.ReverseStringII
object ReverseStringII {
    fun String.reverseStr( k: Int): String {
        val reversedString = StringBuilder()
        var counter = 0
        for ( i in 0 until length step k ) {
            if ( counter %2 == 0 ) {
                StringBuilder(
                    substring( i , if ( i+k > length ) length else i + k )
                ).reverse().let {
                    reversedString.append( it )
                }
            } else {
                reversedString.append(
                    substring( i , if ( i+k > length ) length else i + k )
                )
            }
            counter++
        }
        return reversedString.toString()
    }
}