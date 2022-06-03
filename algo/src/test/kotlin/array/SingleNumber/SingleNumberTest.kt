package array.SingleNumber

import org.junit.Assert
import org.junit.Test
import array.SingleNumber.SingleNumber.singleNumber

class SingleNumberTest {
    @Test
    fun test() {
        Assert.assertEquals( singleNumber( intArrayOf( 2,2,1 ) ) , 1 )
        Assert.assertEquals( singleNumber( intArrayOf( 4,1,2,1,2 ) ) , 4 )
        Assert.assertEquals( singleNumber( intArrayOf( 1 ) ) , 1 )
    }
}