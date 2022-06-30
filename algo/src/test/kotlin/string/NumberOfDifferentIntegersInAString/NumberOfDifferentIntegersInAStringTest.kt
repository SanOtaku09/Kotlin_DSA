package string.NumberOfDifferentIntegersInAString

import org.junit.Assert
import org.junit.Test
import string.NumberOfDifferentIntegersInAString.NumberOfDifferentIntegersInAString.numDifferentIntegers

class NumberOfDifferentIntegersInAStringTest {
    @Test
    fun test() {
        Assert.assertEquals( numDifferentIntegers( "a123bc34d8ef34" ) , 3 )
        Assert.assertEquals( numDifferentIntegers( "leet1234code234" ) , 2 )
        Assert.assertEquals( numDifferentIntegers( "a1b01c001" ) , 1 )
    }
}