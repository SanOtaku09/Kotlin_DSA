package string.UncommonWordsfromTwoSentences

import org.junit.Assert
import org.junit.Test
import string.UncommonWordsfromTwoSentences.UncommonWordsfromTwoSentences.uncommonFromSentences

class UncommonWordsfromTwoSentencesTest {
    @Test
    fun test() {
        Assert.assertArrayEquals(
            uncommonFromSentences( s1 = "this apple is sweet", s2 = "this apple is sour" ) ,
            arrayOf( "sweet","sour" )
        )
        Assert.assertArrayEquals(
            uncommonFromSentences( s1 = "apple apple", s2 = "banana" ) ,
            arrayOf( "banana" )
        )
    }
}