package string.findFirstPalidrome
object findFirstPalidrome {
    fun Array<String>.findFirstPalidrome() : String {
        outer@for ( i in this ) {
            var l = 0 ; var h = i.length-1
            while ( l <= h ) {
                if ( i[l++] != i[h--] ) continue@outer
            }
            return  i
        }
        return ""
    }
}