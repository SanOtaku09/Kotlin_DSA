package string.CheckIfAWordOccursAsAPrefixOfAnyWordInASentence

import org.junit.Assert
import org.junit.Test
import string.CheckIfAWordOccursAsAPrefixOfAnyWordInASentence.CheckIfAWordOccursAsAPrefixOfAnyWordInASentence.isPrefixOfWord

class CheckIfAWordOccursAsAPrefixOfAnyWordInASentenceTest {
    @Test
    fun test() {
        Assert.assertEquals( isPrefixOfWord( "i love eating burger", "burg" ),4 )
        Assert.assertEquals( isPrefixOfWord( "this problem is an easy problem",  "pro" ),2)
        Assert.assertEquals( isPrefixOfWord( "i am tired", "you" ),-1)
    }
}