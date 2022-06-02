package string.LengthOfLastWord

import org.junit.Assert
import org.junit.Test
import string.LengthOfLastWord.LengthOfLastWord.lengthOfLastWord

class LengthOfLastWordTest {
    @Test
    fun test() {
        Assert.assertEquals( lengthOfLastWord( "luffy is still joyboy" ) , 6 )
        Assert.assertEquals( lengthOfLastWord( "Hello World" ) , 5 )
        Assert.assertEquals( lengthOfLastWord( "   fly me   to   the moon  " ) , 4 )
    }
}