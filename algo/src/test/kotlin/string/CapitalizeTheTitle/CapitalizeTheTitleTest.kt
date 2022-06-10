package string.CapitalizeTheTitle

import org.junit.Assert
import org.junit.Test
import string.CapitalizeTheTitle.CapitalizeTheTitle.capitalizeTitle
class CapitalizeTheTitleTest {
    @Test
    fun test() {
        Assert.assertEquals( capitalizeTitle( "capiTalIze tHe titLe" ) , "Capitalize The Title" )
        Assert.assertEquals( capitalizeTitle( "First leTTeR of EACH Word" ) , "First Letter of Each Word" )
        Assert.assertEquals( capitalizeTitle( "i lOve leetcode" ) , "i Love Leetcode" )
    }
}