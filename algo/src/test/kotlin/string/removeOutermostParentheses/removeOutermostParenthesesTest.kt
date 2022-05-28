package string.removeOutermostParentheses

import org.junit.Assert
import org.junit.Test
import string.removeOutermostParentheses.removeOutermostParentheses.removeOutermostParenthese

class removeOutermostParenthesesTest {
    @Test
    fun test(){
        Assert.assertEquals( "(()())(())".removeOutermostParenthese() , "()()()" )
        Assert.assertEquals( "(()())(())(()(()))".removeOutermostParenthese() , "()()()()(())" )
        Assert.assertEquals( "()()".removeOutermostParenthese() , "" )
    }
}