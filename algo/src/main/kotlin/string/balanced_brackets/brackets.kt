package string.balanced_brackets
object brackets {
    fun String.balanced_brackets() : Boolean {
        val deque = ArrayDeque<Char>()
        for ( i in this ) {
            if ( i == '(' || i == '[' || i == '{' ) deque.addFirst( i ) ;
            else if ( i == ')' || i == ']' || i == '}' ) {
                if ( deque.isEmpty() ) return false
                val recent_pair = deque.removeFirst()
                when ( recent_pair ) {
                    '(' -> if ( i == ']' || i == '}' ) return false
                    '[' -> if ( i == ')' || i == '}' ) return false 
                    '{' -> if ( i == ')' || i == ']' ) return false
                }
            }
        }
        return deque.isEmpty()
    }
}