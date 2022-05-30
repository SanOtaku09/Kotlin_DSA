package string.KthDistinctStringInAnArray

object KthDistinctStringInAnArray {
    fun kthDistinct(arr: Array<String>, k: Int): String {
        val map = HashMap<String,Boolean>()
        for ( i in arr ) {
            if ( map.containsKey( i ) ) map.put( i , false )
            else map.put( i , true )
        }
        var n = 0
        for ( i in arr ) {
            if ( map.get( i ) == true ) n++
            if ( n == k ) return i
        }
        return ""
    }
}