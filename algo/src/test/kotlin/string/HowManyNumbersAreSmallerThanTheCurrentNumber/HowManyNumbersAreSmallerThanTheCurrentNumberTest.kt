package string.HowManyNumbersAreSmallerThanTheCurrentNumber

import org.junit.Assert
import org.junit.Test
import string.HowManyNumbersAreSmallerThanTheCurrentNumber.HowManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent

class HowManyNumbersAreSmallerThanTheCurrentNumberTest {
    @Test
    fun test() {
        Assert.assertArrayEquals( smallerNumbersThanCurrent( intArrayOf( 8,1,2,2,3 ) ) , intArrayOf( 4,0,1,1,3 ) )
        Assert.assertArrayEquals( smallerNumbersThanCurrent( intArrayOf( 7,7,7,7 ) ) , intArrayOf( 0,0,0,0 ) )
    }
}