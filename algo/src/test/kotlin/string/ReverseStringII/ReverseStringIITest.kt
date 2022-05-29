package string.ReverseStringII

import org.junit.Assert
import org.junit.Test
import string.ReverseStringII.ReverseStringII.reverseStr

class ReverseStringIITest {
    @Test
    fun test() {
        Assert.assertEquals( "abcdefg".reverseStr( 2 ) , "bacdfeg" )
        Assert.assertEquals( "abcd".reverseStr( 2 ) , "bacd" )
        Assert.assertEquals( "a".reverseStr( 2 ) , "a" )
    }
}