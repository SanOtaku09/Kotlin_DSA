package string.CheckIfTheSentenceIsPangram

object CheckIfTheSentenceIsPangram {
    fun checkIfPangram(sentence: String): Boolean {
        val hash = HashSet<Char>()
        for ( i in sentence ) {
            if ( i in 'a' .. 'z' ) {
                hash.add( i )
            }
            if ( hash.size == 26 ) return true
        }
        return if ( hash.size == 26 ) true else false
    }
}