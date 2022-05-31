package string.TruncateSentence

import org.junit.Test
import org.junit.Assert
import string.TruncateSentence.TruncateSentence.truncateSentence

class TruncateSentenceTest {
    @Test
    fun test() {
        Assert.assertEquals( truncateSentence( "Hello how are you Contestant", 4 ) , "Hello how are you" )
        Assert.assertEquals( truncateSentence( "What is the solution to this problem",4 ) , "What is the solution" )
        Assert.assertEquals( truncateSentence( "chopper is not a tanuki", 5) , "chopper is not a tanuki" )
    }
}