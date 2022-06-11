package string.DetectCapital

object DetectCapital {
    fun detectCapitalUse(word: String): Boolean {
        return ( word.lowercase() == word || word.uppercase() == word || ( word[0].uppercase()[0] == word[0] && word.substring( 1 ).lowercase() == word.substring( 1 ) ))
    }
}