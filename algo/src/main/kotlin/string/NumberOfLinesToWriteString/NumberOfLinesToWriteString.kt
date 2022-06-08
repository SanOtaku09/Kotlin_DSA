package string.NumberOfLinesToWriteString

object NumberOfLinesToWriteString {
    fun numberOfLines(widths: IntArray, s: String): IntArray {
        if ( s.length == 0 ) return intArrayOf( 0 , 0 )
        var line = 1
        var pixelSize = 0
        for ( char in s ) {
            if ( pixelSize + widths[ char - 'a' ] > 100 ) {
                pixelSize = 0
                line++
            }
            pixelSize += widths[ char - 'a' ]
        }
        return intArrayOf( line , pixelSize )
    }
}