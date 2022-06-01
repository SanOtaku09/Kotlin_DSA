package string.UniqueMorseCodeWords

object UniqueMorseCodeWords {
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val arrayMorse = arrayOf( ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.." )
        val unique = HashSet<String>()
        for ( i in words ) {
            val string = StringBuilder()
            for ( j in i ) string.append( arrayMorse[ j - 'a' ] )
            unique.add( string.toString() )
        }
        return unique.size
    }
}