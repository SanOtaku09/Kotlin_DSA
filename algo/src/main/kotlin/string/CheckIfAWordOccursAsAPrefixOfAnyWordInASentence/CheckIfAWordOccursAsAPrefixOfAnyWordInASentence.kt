package string.CheckIfAWordOccursAsAPrefixOfAnyWordInASentence

object CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    fun isPrefixOfWord(sentence: String, searchWord: String): Int {
        var start = 0
        var index = 1
        val prefixLen = searchWord.length
        for ( i in 0 .. sentence.length ) {
            if ( ( i < sentence.length && sentence[i] == ' ' ) || i == sentence.length ) {
                if ( i - start >= prefixLen && sentence.substring( start , start+prefixLen ) == searchWord ) return index
                start = i+1
                index++
            }
        }
        return -1
    }
}