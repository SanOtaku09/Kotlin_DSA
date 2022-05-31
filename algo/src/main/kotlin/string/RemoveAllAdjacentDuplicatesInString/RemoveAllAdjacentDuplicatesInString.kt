package string.RemoveAllAdjacentDuplicatesInString

object RemoveAllAdjacentDuplicatesInString {

    var string = StringBuilder()

    fun removeDuplicates(s: String): String {
        string = StringBuilder( s )
        removeAdjacent()
        return string.toString()
    }

    private fun removeAdjacent(){
        var i = 0 ; var len = string.length-1
        while ( i < len ) {
            if (string.get(i) != string.get(i + 1)) i++
            else {
                string.delete( i , i+2 )
                len -= 2
                if ( i > 0 ) i--
            }
        }
    }

}