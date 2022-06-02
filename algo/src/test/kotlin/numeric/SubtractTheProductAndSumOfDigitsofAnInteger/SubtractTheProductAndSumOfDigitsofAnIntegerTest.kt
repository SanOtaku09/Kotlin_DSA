package numeric.SubtractTheProductAndSumOfDigitsofAnInteger

import org.junit.Assert
import org.junit.Test
import numeric.SubtractTheProductAndSumOfDigitsofAnInteger.SubtractTheProductAndSumOfDigitsofAnInteger.subtractProductAndSum

class SubtractTheProductAndSumOfDigitsofAnIntegerTest {
    @Test
    fun test() {
        Assert.assertEquals( subtractProductAndSum( 234 ) , 15 )
        Assert.assertEquals( subtractProductAndSum( 4421 ) , 21 )
    }
}