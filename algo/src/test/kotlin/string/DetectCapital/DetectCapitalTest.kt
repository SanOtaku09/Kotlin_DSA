package string.DetectCapital

import org.junit.Assert
import org.junit.Test
import string.DetectCapital.DetectCapital.detectCapitalUse

class DetectCapitalTest {
    @Test
    fun test() {
        Assert.assertEquals( detectCapitalUse( "USA" ) , true )
        Assert.assertEquals( detectCapitalUse( "FlaG" ) , false )
    }
}