package string.OccurrencesAfterBigram

import org.junit.Assert
import org.junit.Test
import string.OccurrencesAfterBigram.OccurrencesAfterBigram.findOcurrences

class OccurrencesAfterBigramTest {
    @Test
    fun test() {
        Assert.assertArrayEquals( findOcurrences( "alice is a good girl she is a good student", "a","good" ) , arrayOf( "girl","student" ) )
        Assert.assertArrayEquals( findOcurrences( "we will we will rock you", "we","will" ) , arrayOf( "we","rock" ) )
    }
}