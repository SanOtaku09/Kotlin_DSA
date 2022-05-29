package string.ReversePrefixOfWord

import org.junit.Assert
import org.junit.Test
import string.ReversePrefixOfWord.ReversePrefixOfWord.reversePrefix

class ReversePrefixOfWordTest {
    @Test
    fun test() {
        Assert.assertEquals( "abcdefd".reversePrefix( 'd' ) , "dcbaefd" )
        Assert.assertEquals( "xyxzxe".reversePrefix( 'z' ) , "zxyxxe")
        Assert.assertEquals( "abcd".reversePrefix( 'z' ) , "abcd" )
    }
}