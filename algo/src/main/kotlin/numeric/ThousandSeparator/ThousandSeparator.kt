package numeric.ThousandSeparator

object ThousandSeparator {
    fun thousandSeperator( n : Int ) : String {
        if ( n == 0 ) return "0"
        val str = StringBuilder()
        var  i = n
        var count = 0
        while ( i != 0 ){
            if ( count > 0 && count%3 == 0 ) str.append( "." )
            str.append( i % 10 )
            i /= 10
            count++
        }
        return str.reverse().toString()
    }
}