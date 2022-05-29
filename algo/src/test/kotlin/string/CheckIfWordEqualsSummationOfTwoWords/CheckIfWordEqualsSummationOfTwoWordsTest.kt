package string.CheckIfWordEqualsSummationOfTwoWords

import org.junit.Assert
import org.junit.Test
import string.CheckIfWordEqualsSummationOfTwoWords.CheckIfWordEqualsSummationOfTwoWords.isSumEqual

class CheckIfWordEqualsSummationOfTwoWordsTest {
    @Test
    fun test() {
        Assert.assertEquals( isSumEqual( "acb", "cba", "cdb" ) , true )
        Assert.assertEquals( isSumEqual( "aaa", "a" ,"aab" ) , false )
        Assert.assertEquals( isSumEqual("aaa" , "a" , "aaaa" ) , true )
    }
}