package string.pangram

import java.util.*

object pangram {
    fun String.isPangram() : Boolean {
        val s = replace( " " , "" )
        if ( s.length < 26 ) return false
        val array = s.lowercase().toCharArray()
        Arrays.sort( array )
        var start = 0
        var end = array.size-1
        while ( start < end && array[start] != 'a' ) start++
        if ( end - start < 25 ) return false
        while ( end > start && array[end] != 'z' ) end--
        if ( end - start < 25 ) return false
        while ( start < end ) {
            if ( array[start] != array[start+1] && array[start].code != array[start+1].code-1 ) return false
            start++
        }
        return true
    }
}