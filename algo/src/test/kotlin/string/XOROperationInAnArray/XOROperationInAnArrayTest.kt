package string.XOROperationInAnArray

import org.junit.Assert
import org.junit.Test
import string.XOROperationInAnArray.XOROperationInAnArray.xorOperation

class XOROperationInAnArrayTest {
    @Test
    fun test() {
        Assert.assertEquals( xorOperation( 5 , 0 ) , 8 )
        Assert.assertEquals( xorOperation( 4 , 3 ) , 8 )
    }
}