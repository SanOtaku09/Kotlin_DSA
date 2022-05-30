package string.MaximumNumberOfWordsYouCanType

object MaximumNumberOfWordsYouCanType {
    fun canBeTypedWords(text: String, brokenLetters: String): Int {
        var count = 0
        val brokenKey = brokenLetters.toHashSet()
        var i = 0
        while ( i < text.length ) {
            if ( text[i] == ' ' ) count++
            else if ( brokenKey.contains( text[i] ) ){
                while ( i < text.length && text[i] != ' ' ) i++
            } else if ( i == text.length -1 ) count++
            i++
        }
        return count
    }
}