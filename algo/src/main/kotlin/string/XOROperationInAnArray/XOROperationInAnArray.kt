package string.XOROperationInAnArray

object XOROperationInAnArray {
    fun xorOperation(n: Int, start: Int): Int {
        if ( n < 2 ) return start
        val array = IntArray( n ) { ( it*2 ) + start }
        var num = array[0].xor( array[1] )
        for ( i in 2 until array.size ) num = num.xor( array[i] )
        return num
    }
}