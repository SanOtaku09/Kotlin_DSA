package string.CountTheNumberOfConsistentStrings

object CountTheNumberOfConsistentStrings {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        var count = 0
        main@for ( i in words ){
            var string = i
            for ( j in allowed ) {
                string = string.replace( j.toString() , "" )
                if ( string.trim() == "" ){
                    count++
                    continue@main
                }
            }
            if ( string.trim() == "" ) count++
        }
        return count
    }
}