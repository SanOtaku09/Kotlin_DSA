package string.KeyboardRow

import org.junit.Assert
import org.junit.Test
import string.KeyboardRow.KeyboardRow.findWords

class KeyboardRowTest {
    @Test
    fun test() {
        Assert.assertArrayEquals( findWords( arrayOf( "Hello","Alaska","Dad","Peace" ) ) , arrayOf( "Alaska","Dad" ) )
    }
}