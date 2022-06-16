package string.SumOfDigitsOfStringAfterConvert

import org.junit.Assert
import org.junit.Test
import string.SumOfDigitsOfStringAfterConvert.SumOfDigitsOfStringAfterConvert.getLucky

class SumOfDigitsOfStringAfterConvertTest {
    @Test
    fun test() {
        Assert.assertEquals( getLucky( "iiii", 1 ) , 36 )
        Assert.assertEquals( getLucky( "leetcode", 2 ) , 6 )
        Assert.assertEquals( getLucky( "zbax", 2 ) , 8 )
        Assert.assertEquals( getLucky( "qhquvppzooyt" , 6 ) , 2 )
    }
}