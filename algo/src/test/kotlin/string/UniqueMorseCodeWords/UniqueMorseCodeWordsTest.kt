package string.UniqueMorseCodeWords

import org.junit.Assert
import org.junit.Test
import string.UniqueMorseCodeWords.UniqueMorseCodeWords.uniqueMorseRepresentations

class UniqueMorseCodeWordsTest {
    @Test
    fun test() {
        Assert.assertEquals( uniqueMorseRepresentations( arrayOf( "gin","zen","gig","msg" ) ) , 2 )
        Assert.assertEquals( uniqueMorseRepresentations( arrayOf( "a" ) ) , 1 )
    }
}