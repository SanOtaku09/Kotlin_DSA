package numeric.DecompressRunLengthEncodedList

import org.junit.Assert
import org.junit.Test
import numeric.DecompressRunLengthEncodedList.DecompressRunLengthEncodedList.decompressRLElist

class DecompressRunLengthEncodedListTest {
    @Test
    fun test() {
        Assert.assertArrayEquals( decompressRLElist( intArrayOf( 1,2,3,4 ) ) , intArrayOf( 2,4,4,4 ) )
        Assert.assertArrayEquals( decompressRLElist( intArrayOf( 1,1,2,3 ) ) , intArrayOf( 1,3,3 ) )
    }
}