package string.StringMatchingInAnArray

object StringMatchingInAnArray {
    fun stringMatching(words: Array<String>): List<String> {
        val list = HashSet<String>( words.size )
        for ( i in words ) {
            val temp = i
            main@for ( j in words ) {
                if ( temp.length > j.length || j == temp ) continue
                if ( j.contains( temp ) ) {
                    list.add( temp )
                    continue@main
                }
            }
        }
        return list.toList()
    }
}