package string.MaximumProductOfWordLengths

import kotlin.collections.HashSet

object MaximumProductOfWordLengths {

    fun maxProduct(words: Array<String>): Int {
        var max = 0
        for ( i in words.size-1 downTo 0 ) {
            val hashSet = HashSet<Char>()
            for ( j in words[i] ) hashSet.add( j )
            inner@for ( j in words.size-1 downTo 0 ) {
                if ( i == j ) continue
                for ( k in words[j] ) {
                    if ( hashSet.contains( k ) ) continue@inner
                }
                (words[i].length * words[j].length).let {
                    if ( max < it ) max = it
                }
            }
        }
        return max
    }

}