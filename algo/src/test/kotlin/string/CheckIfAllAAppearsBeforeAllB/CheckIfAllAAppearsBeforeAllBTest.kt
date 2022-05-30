package string.CheckIfAllAAppearsBeforeAllB

import org.junit.Assert
import org.junit.Test
import string.CheckIfAllAAppearsBeforeAllB.CheckIfAllAAppearsBeforeAllB.checkString

class CheckIfAllAAppearsBeforeAllBTest {
    @Test
    fun test() {
        Assert.assertEquals( checkString( "aaabbb" ) , true )
        Assert.assertEquals( checkString( "abab" ) , false )
        Assert.assertEquals( checkString( "bbb" ) , true )
    }
}