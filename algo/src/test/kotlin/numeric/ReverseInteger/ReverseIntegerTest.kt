package numeric.ReverseInteger

import org.junit.Test
import numeric.ReverseInteger.ReverseInteger.reverse
import org.junit.Assert

class ReverseIntegerTest {
    @Test
    fun test() {
        Assert.assertEquals( reverse( 123 ) , 321 )
        Assert.assertEquals( reverse( -123 ) , -321 )
        Assert.assertEquals( reverse( 120 ) , 21 )
    }
}