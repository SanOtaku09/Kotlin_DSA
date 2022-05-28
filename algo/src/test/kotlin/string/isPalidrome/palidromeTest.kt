package string.isPalidrome

import org.junit.Assert
import org.junit.Test
import string.isPalidrome.palidrome.isPalidrome

class palidromeTest {
    @Test
    fun test() {
        Assert.assertTrue( 123321.isPalidrome() )
        Assert.assertTrue( "hellolleh".isPalidrome() )
        Assert.assertFalse( true.isPalidrome() )
        Assert.assertFalse( false.isPalidrome() )
        Assert.assertFalse( "abcab".isPalidrome() )
    }
}