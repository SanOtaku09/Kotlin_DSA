package string.balancedString
object balancedString {
    fun String.countBalanced() : Int {
        var count = 0
        var L = 0
        var R = 0
        for ( i in this ) {
            if ( i == 'L' ) L++
            else R++
            if ( L == R ) count++
        }
        return count
    }
}