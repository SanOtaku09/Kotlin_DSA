package string.ValidAnagram

import org.junit.Assert
import org.junit.Test
import string.ValidAnagram.ValidAnagram.isAnagram

class ValidAnagramTest {
    @Test
    fun test() {
        Assert.assertEquals( isAnagram( "anagram" , "nagaram" ) , true )
        Assert.assertEquals( isAnagram( "rat" , "car" ) , false )
    }
}