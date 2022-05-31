package array.CheckIfTwoStringArraysAreEquivalent

import java.util.*

object CheckIfTwoStringArraysAreEquivalent {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        var i = 0 ; var j = 0
        val string1 = StringBuilder() ; val string2 = StringBuilder()
        while ( i < word1.size || j < word2.size ) {
            if ( i < word1.size ) string1.append( word1[i++] )
            if ( j < word2.size ) string2.append( word2[j++] )
        }
        return ( string1.toString() == string2.toString() )
    }
}