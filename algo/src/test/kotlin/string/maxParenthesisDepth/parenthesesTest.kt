package string.maxParenthesisDepth

import org.junit.Assert
import org.junit.Test
import string.maxParenthesisDepth.parentheses.maxDepth

class parenthesesTest {
    @Test
    fun tedt() {
        Assert.assertEquals( "(1+(2*3)+((8)/4))+1".maxDepth() , 3 )
        Assert.assertEquals( "(1)+((2))+(((3)))".maxDepth() , 3 )
    }
}