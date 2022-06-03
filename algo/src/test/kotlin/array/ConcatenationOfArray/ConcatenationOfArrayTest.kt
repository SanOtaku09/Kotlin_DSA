package array.ConcatenationOfArray

import org.junit.Assert
import org.junit.Test
import array.ConcatenationOfArray.ConcatenationOfArray.getConcatenation

class ConcatenationOfArrayTest {
    @Test
    fun test() {
        Assert.assertArrayEquals(
            getConcatenation( intArrayOf( 1,2,1 ) ) ,
            intArrayOf( 1,2,1,1,2,1 )
        )
        Assert.assertArrayEquals(
            getConcatenation( intArrayOf( 1,3,2,1 ) ) ,
            intArrayOf( 1,3,2,1,1,3,2,1 )
        )
    }
}