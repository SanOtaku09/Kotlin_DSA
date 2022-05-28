package string.rotation

import org.junit.Assert
import org.junit.Test
import string.rotation.rotation.rotate

class rotationTest {
    @Test
    fun test() {
        var input = "hello world"
        Assert.assertEquals( input.rotate( 2 ) , "llo worldhe" )
        Assert.assertEquals( input.rotate( 13 ) , "llo worldhe" )
        Assert.assertEquals( input.rotate( 11 ) , input )
    }
}