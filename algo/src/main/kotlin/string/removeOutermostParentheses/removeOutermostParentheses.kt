package string.removeOutermostParentheses

object removeOutermostParentheses {
    fun String.removeOutermostParenthese() : String {
        var newString = StringBuilder()
        var open = 0
        for ( i in this ) {
            if ( i == '(' ) {
                if ( open != 0 ) {
                    newString.append( i )
                }
                open++
            } else if ( i == ')' ) {
                if ( open != 1 ) {
                    newString.append( i )
                }
                open--
            }
        }
        return String( newString )
    }
}