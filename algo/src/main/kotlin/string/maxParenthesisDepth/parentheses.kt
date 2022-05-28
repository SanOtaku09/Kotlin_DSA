package string.maxParenthesisDepth
object parentheses {
    fun String.maxDepth() : Int {
        var s = this.replace( "[" , "(" )
        s = s.replace( "{" , "(" )
        s = s.replace( "]" , ")" )
        s = s.replace( "}" , ")" )
        var max = 0
        var temp = 0
        for ( i in s ) {
            if ( i == '(' ) temp++
            else if ( i == ')' ) {
                if ( max < temp ) max = temp
                temp--
            }
        }
        return max
    }
}