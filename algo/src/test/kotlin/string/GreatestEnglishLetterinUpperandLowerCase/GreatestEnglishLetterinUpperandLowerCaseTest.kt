package string.GreatestEnglishLetterinUpperandLowerCase
import org.junit.Assert
import org.junit.Test
import string.GreatestEnglishLetterinUpperandLowerCase.GreatestEnglishLetterinUpperandLowerCase.greatestLetter

class GreatestEnglishLetterinUpperandLowerCaseTest {
    @Test
    fun test() {
        Assert.assertEquals( greatestLetter( "lEeTcOdE" ) , "E" )
        Assert.assertEquals( greatestLetter( "arRAzFif" ) , "R" )
        Assert.assertEquals( greatestLetter( "AbCdEfGhIjK" ) , "" )
    }
}