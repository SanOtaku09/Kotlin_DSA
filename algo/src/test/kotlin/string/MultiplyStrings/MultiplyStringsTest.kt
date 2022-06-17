package string.MultiplyStrings

import org.junit.Assert
import org.junit.Test
import string.MultiplyStrings.MultiplyStrings.multiply

class MultiplyStringsTest {
    @Test
    fun test() {
        Assert.assertEquals( multiply( "2" , "3" ) , "6" )
        Assert.assertEquals( multiply( "123" , "456" ) ,"56088" )
    }
}