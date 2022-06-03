package numeric.NumberOf1Bits

import org.junit.Assert
import org.junit.Test
import numeric.NumberOf1Bits.NumberOf1Bits.hammingWeight

class NumberOf1BitsTest {
    @Test
    fun test() {
        Assert.assertEquals( hammingWeight( 11 ) , 3 )
        Assert.assertEquals( hammingWeight( 128 ) , 1 )
        Assert.assertEquals( hammingWeight( -3 ) , 31 )
    }
}