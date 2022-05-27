package string.alphabetical_order
object alphabetic {
    fun alphabetical_order( s : String ) : Boolean {
        var s = s.lowercase()
        for ( i in 0 until s.length-1 ) {
            if ( ! ( s[i] in 'a' .. 'z' ) || s[i] > s[i+1] ) {
                return false
            }
        }
        return true
    }
}