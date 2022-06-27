package string.ReverseOnlyLetters

object ReverseOnlyLetters {
    fun reverseOnlyLetters(s: String): String {
        val ans = StringBuilder()
        for ( i in s ) if ( (i in 'a'..'z') || (i in 'A'..'Z') ) ans.append( 'a' ) else ans.append( i )
        var index = 0
        for ( i in s.length-1 downTo 0 ) {
            while ( index < ans.length && ans[index] != 'a' ) index++
            if ( index == ans.length ) break
            if ( s[i] in 'a' .. 'z' || s[i] in 'A' .. 'Z' ) {
                ans[index] = s[i]
                index++
            }
        }
        return ans.toString()
    }
}