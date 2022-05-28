package string.increasingDecreasingString

import org.junit.Assert
import org.junit.Test
import string.increasingDecreasingString.IncreasingDecreasingString.IncreasingDecreasingString

class IncreasingDecreasingStringTest {
    @Test
    fun test() {
        Assert.assertEquals( "aaaabbbbcccc".IncreasingDecreasingString() , "abccbaabccba" )
        Assert.assertEquals( "rat".IncreasingDecreasingString() , "art" )
    }
}