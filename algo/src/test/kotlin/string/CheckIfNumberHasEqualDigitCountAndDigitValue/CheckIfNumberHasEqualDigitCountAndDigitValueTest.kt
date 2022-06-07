package string.CheckIfNumberHasEqualDigitCountAndDigitValue

import org.junit.Assert
import org.junit.Test
import string.CheckIfNumberHasEqualDigitCountAndDigitValue.CheckIfNumberHasEqualDigitCountAndDigitValue.digitCount

class CheckIfNumberHasEqualDigitCountAndDigitValueTest {
    @Test
    fun test() {
        Assert.assertEquals( digitCount("1210") , true )
        Assert.assertEquals( digitCount("030") , false )
    }
}