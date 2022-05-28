package string.isPalidrome

object palidrome {

    fun Any.isPalidrome() : Boolean = this.toString().isPalidrome()

    private fun String.isPalidrome() : Boolean {
        var l = 0 ; var r = length-1
        while ( l <= r ) {
            if ( this[l++] != this[r--] ) return false
        }
        return true
    }
}