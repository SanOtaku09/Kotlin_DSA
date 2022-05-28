package string.reverse

object reverse {
    fun String.reverse() : String {
        var newString = StringBuilder()
        for ( i in this.length -1 downTo 0 )
            newString.append( this[i] )
        return String( newString )
    }
}