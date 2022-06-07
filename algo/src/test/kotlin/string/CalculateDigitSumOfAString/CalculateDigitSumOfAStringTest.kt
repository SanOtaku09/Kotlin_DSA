package string.CalculateDigitSumOfAString

import org.junit.Assert
import org.junit.Test
import string.CalculateDigitSumOfAString.CalculateDigitSumOfAString.digitSum

class CalculateDigitSumOfAStringTest {
    @Test
    fun test() {
   //     Assert.assertEquals( digitSum( "11111222223", 3 ) , "135" )
        Assert.assertEquals( digitSum( "1234", 2 ) , "37" )
    }
}