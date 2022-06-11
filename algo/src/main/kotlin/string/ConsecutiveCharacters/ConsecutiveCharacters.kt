package string.ConsecutiveCharacters

object ConsecutiveCharacters {
    fun maxPower(s: String): Int {
        var max = 0
        var count = 1
        for ( i in 1 until s.length ) {
            if ( s[i-1] == s[i] ) count++
            else {
                if ( max < count ) max = count
                count = 1
            }
        }
        return if ( max < count ) count else max
    }
}