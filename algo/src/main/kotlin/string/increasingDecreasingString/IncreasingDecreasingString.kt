package string.increasingDecreasingString

object IncreasingDecreasingString {
    fun String.IncreasingDecreasingString() : String {
        val ans = StringBuilder( this.length )
        val frequency = IntArray( 26 ){ 0 }
        for ( i in this ) frequency[ i - 'a' ]++
        var temp = 0 ; var noOfTries = -1
        while ( temp < this.length ) {
            var tempStr = StringBuilder()
            noOfTries++
            for ( i in 0 until 26 ) {
                if ( frequency[i] != 0 ) {
                    temp++
                    frequency[i]--
                    tempStr.append( ( 'a' + i ).toChar() )
                }
            }
            ans.append( if ( noOfTries % 2 == 0 ) tempStr else tempStr.reverse() )
        }
        return ans.toString()
    }
}