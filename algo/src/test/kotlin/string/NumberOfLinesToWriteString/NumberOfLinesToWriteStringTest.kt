package string.NumberOfLinesToWriteString

import org.junit.Assert
import org.junit.Test
import string.NumberOfLinesToWriteString.NumberOfLinesToWriteString.numberOfLines

class NumberOfLinesToWriteStringTest {
    @Test
    fun test() {
        Assert.assertArrayEquals( numberOfLines( intArrayOf( 10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10) , "abcdefghijklmnopqrstuvwxyz" ) , intArrayOf( 3 , 60 ) )
        Assert.assertArrayEquals( numberOfLines( intArrayOf( 4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10 ) , "bbbcccdddaaa") , intArrayOf( 2 , 4 ) )
    }
}