package string.findFirstPalidrome

import org.junit.Assert
import org.junit.Test
import string.findFirstPalidrome.findFirstPalidrome.findFirstPalidrome

class findFirstPalidromeTest {
    @Test
    fun test() {
        Assert.assertEquals( arrayOf( "abc","car","ada","racecar","cool" ).findFirstPalidrome() , "ada" )
        Assert.assertEquals( arrayOf( "notapalindrome","racecar" ).findFirstPalidrome() , "racecar" )
        Assert.assertEquals( arrayOf( "def","ghi" ).findFirstPalidrome() , "" )
    }
}