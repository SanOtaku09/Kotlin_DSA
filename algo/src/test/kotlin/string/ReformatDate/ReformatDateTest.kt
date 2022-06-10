package string.ReformatDate

import org.junit.Assert
import org.junit.Test
import string.ReformatDate.ReformatDate.reformatDate

class ReformatDateTest {
    @Test
    fun test() {
        Assert.assertEquals( reformatDate( "20th Oct 2052" ) , "2052-10-20" )
        Assert.assertEquals( reformatDate(  "6th Jun 1933" ) , "1933-06-06" )
        Assert.assertEquals( reformatDate(  "26th May 1960" ) , "1960-05-26" )
    }
}