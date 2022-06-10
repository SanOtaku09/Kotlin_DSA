package string.ReformatPhoneNumber

object ReformatPhoneNumber {
    fun reformatNumber(number: String): String {
        val ans = StringBuilder()
        val temp = StringBuilder()
        for ( i in number ) if ( i in '0' .. '9' ) temp.append( i )
        var i = 0 ; val len = temp.length
        while ( i < len ) {
            val remainder = len - i
            if ( remainder == 4 || remainder == 2 ) {
                ans.append( temp.substring( i , i +2 ) )
                i += 2
            } else {
                ans.append( temp.substring( i , i +3 ) )
                i += 3
            }
            if ( i != len ) ans.append( "-" )
        }
        return ans.toString()
    }
}