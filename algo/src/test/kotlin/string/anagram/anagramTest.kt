package string.anagram

import org.junit.Assert
import org.junit.Test
import string.anagram.anagram.isANagramOf
class anagramTest {
    @Test
    fun test() {
        val s1 = "deal"
        val s2 = "lead"
        val s3 = "has"
        val s4 = "had"
        Assert.assertTrue( s1.isANagramOf( s2 ) )
        Assert.assertFalse( s3.isANagramOf( s4 ) )
    }
}