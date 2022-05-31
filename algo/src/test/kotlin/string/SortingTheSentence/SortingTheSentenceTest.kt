package string.SortingTheSentence

import org.junit.Assert
import org.junit.Test
import string.SortingTheSentence.SortingTheSentence.sortSentence

class SortingTheSentenceTest {
    @Test
    fun test() {
        Assert.assertEquals( sortSentence( "is2 sentence4 This1 a3" ) ,"This is a sentence" )
        Assert.assertEquals( sortSentence( "Myself2 Me1 I4 and3" ) , "Me Myself and I"  )
    }
}