package string.CheckWhetherTwoStringsAreAlmostEquivalent

object CheckWhetherTwoStringsAreAlmostEquivalent {
    fun checkAlmostEquivalent(word1: String, word2: String): Boolean {
        val frequency = IntArray( 26 ){ 0 }
        var i = 0 ; var j = 0
        while ( i < word1.length || j < word2.length ) {
            if ( i < word1.length ) frequency[ word1[i++] - 'a' ]++
            if ( j < word2.length ) frequency[ word2[j++] - 'a' ]--
        }
        for ( f in frequency ) {
            if ( f > 3 || f < -3 ) return false
        }
        return true
    }
}