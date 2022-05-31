package string.ReplaceAllDigitsWithCharacters

import org.junit.Assert
import org.junit.Test
import string.ReplaceAllDigitsWithCharacters.ReplaceAllDigitsWithCharacters.replaceDigits

class ReplaceAllDigitsWithCharactersTest {
    @Test
    fun test() {
        Assert.assertEquals( replaceDigits( "a1c1e1" ) , "abcdef" )
        Assert.assertEquals( replaceDigits( "a1b2c3d4e" ) , "abbdcfdhe" )
    }
}