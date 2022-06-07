package string.CheckIfNumberHasEqualDigitCountAndDigitValue

object CheckIfNumberHasEqualDigitCountAndDigitValue {
    fun digitCount(num: String): Boolean {
        val map = HashMap<Int,Int>()
        for ( i in num ) {
            val n = i.code - '0'.code
            if ( ! map.containsKey( n ) ) map.put( n , 1 )
            else map[ n ] = map[ n ]!!+1
        }
        for ( ( i , v ) in map ) {
            if ( i >= num.length ) return false
            else if ( v != num[i].code-'0'.code ) return false
        }
        return true
    }
}