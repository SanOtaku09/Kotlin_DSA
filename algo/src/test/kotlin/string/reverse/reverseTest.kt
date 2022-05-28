package string.reverse

import org.junit.Assert
import org.junit.Test
import string.reverse.reverse.reverse

class reverseTest {
    @Test
    fun test() {
        Assert.assertEquals( "hello".reverse() , "olleh" )
        Assert.assertEquals( "world".reverse() , "dlrow" )
    }
}