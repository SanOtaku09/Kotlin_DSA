package string.KthDistinctStringInAnArray

import org.junit.Assert
import org.junit.Test
import string.KthDistinctStringInAnArray.KthDistinctStringInAnArray.kthDistinct

class KthDistinctStringInAnArrayTest {
    @Test
    fun test(){
        Assert.assertEquals( kthDistinct( arrayOf( "d","b","c","b","c","a" ) , 2 ) , "a" )
        Assert.assertEquals( kthDistinct( arrayOf( "aaa","aa","a" ) , 1  ) , "aaa" )
        Assert.assertEquals( kthDistinct( arrayOf( "a","b","a" ) , 3 ) , "" )
    }
}