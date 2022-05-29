package string.ReversePrefixOfWord
object ReversePrefixOfWord {
    fun String.reversePrefix( ch: Char ) : String {
        val ans = StringBuilder()
        var bool = true
        for ( i in this ) {
            ans.append( i )
            if ( bool && i == ch ){
                bool = false
                ans.reverse()
            }
        }
        return ans.toString()
    }
}