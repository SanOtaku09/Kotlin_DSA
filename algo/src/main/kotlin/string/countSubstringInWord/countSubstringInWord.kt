package string.countSubstringInWord

object countSubstringInWord {
    fun Array<String>.count( word : String ) : Int {
        var count = 0
        for ( i in this ) {
            if ( word.contains( i ) ) count++
        }
        return count
    }
}