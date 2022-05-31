package string.MinimumTimeToTypeWordUsingSpecialTypewriter

object MinimumTimeToTypeWordUsingSpecialTypewriter {
    fun minTimeToType(word: String): Int {
        var steps = 0
        var pointer = 'a'
        for ( i in word ) {
            var len1 = 0
            var len2 = 0
            if ( pointer < i ) {
                len1 = i - pointer
                len2 = ('z' - i ) + ( pointer - 'a' ) + 1
            } else {
                len1 = pointer - i
                len2 = ('z' - pointer ) + ( i - 'a' ) + 1
            }
            pointer = i
            steps += if ( len2 < len1 ) len2 else len1
            steps++
        }
        return steps
    }
}