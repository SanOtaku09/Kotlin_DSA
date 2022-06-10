package string.ValidAnagram

object ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if ( s.length != t.length ) return false
        val frequency = IntArray(26){0}
        for ( i in s ) frequency[i-'a']++
        for ( i in t ) frequency[i-'a']--
        for ( i in frequency ) if ( i != 0 ) return false
        return true
    }
}