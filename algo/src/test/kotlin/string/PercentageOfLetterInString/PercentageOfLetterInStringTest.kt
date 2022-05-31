package string.PercentageOfLetterInString

import org.junit.Assert
import org.junit.Test
import string.PercentageOfLetterInString.PercentageOfLetterInString.percentageLetter

class PercentageOfLetterInStringTest {
    @Test
    fun test() {
        Assert.assertEquals( percentageLetter( "foobar" , 'o' ) , 33 )
        Assert.assertEquals( percentageLetter( "jjjj" , 'k' ) , 0 )
    }
}