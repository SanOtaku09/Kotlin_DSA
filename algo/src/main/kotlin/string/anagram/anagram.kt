package string.anagram
import java.util.*

object anagram {

    fun String.isANagramOf( s : String ) : Boolean {
        if ( this.length != s.length ) return false
        val s1 = this.toCharArray()
        val s2 = s.toCharArray()
        Arrays.sort( s1 )
        Arrays.sort( s2 )
        return Arrays.equals( s1 , s2 )
    }

}