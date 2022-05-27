package string.zig_zag_pattern
object zigZagPattern {
    fun String.encode( numRows : Int ) : String {
        if ( this.length <= numRows || numRows < 2 ) return this
        val newString = CharArray( this.length ) { ' ' }
        var start = 0
        var index = 0
        var height = 1
        var depth: Int = numRows
        while (  index < this.length ) {
            var pointer = start
            var height_space = 2 + ( 2 * ( height - 2 ) )
            var depth_space = 2 + ( 2 * ( depth - 2 ) )
            var bool = true
            while ( pointer < this.length ) {
                newString[index++] = this[pointer]
                if ( height_space == 0 ) pointer += depth_space
                else if ( depth_space == 0 ) pointer += height_space
                else if ( bool ) {
                    pointer += depth_space
                    bool = false
                } else {
                    pointer += height_space
                    bool = true
                }
            }
            height++
            depth--
            start++
        }
        return String( newString )
    }
}