package string.KeyboardRow

object KeyboardRow {

    val rows = arrayOf(
            setOf( 'q','w','e','r','t','y','u','i','o','p') ,
            setOf( 'a','s','d','f','g','h','j','k','l' ) ,
            setOf( 'z','x','c','v','b','n','m' )
    )

    fun findWords(words: Array<String>): Array<String> {
        var array = ArrayList<String>( words.size )
        for ( i in words ) {
            if (
                check( i , rows[0] ) ||
                check( i , rows[1] ) ||
                check( i , rows[2] )
            ) array.add( i )
        }
        return array.toTypedArray()
    }

    fun check( s : String , row : Set<Char> ) : Boolean {
        for ( i in s.lowercase() ) if ( !row.contains(i) ) return false
        return true
    }

}