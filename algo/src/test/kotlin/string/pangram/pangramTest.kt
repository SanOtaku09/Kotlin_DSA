package string.pangram

import org.junit.Assert
import org.junit.Test
import string.pangram.pangram.isPangram

class pangramTest {
    @Test
    fun test() {
        Assert.assertTrue( "ab      cdefghijklm        no     pqrstuvwxyz".isPangram() )
        Assert.assertTrue( "The quick brown fox jumps over the lazy dog".isPangram() )
        Assert.assertFalse( "The quick brown fox jumps over the azy dog".isPangram() )
    }
}