package numeric.DecompressRunLengthEncodedList

object DecompressRunLengthEncodedList {
    fun decompressRLElist(nums: IntArray): IntArray {
        val array = ArrayList<Int>( nums.size * 10 )
        for ( i in 0 until nums.size step 2 ) {
            repeat( nums[i] ) {
                array.add( nums[i+1] )
            }
        }
        return IntArray( array.size ) { array[it] }
    }
}