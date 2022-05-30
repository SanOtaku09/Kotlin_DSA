package string.KeyboardRow

import org.junit.Assert
import org.junit.Test
import string.KeyboardRow.KeyboardRow.findWords

class KeyboardRowTest {
    @Test
    fun test() {
        Assert.assertArrayEquals( findWords( arrayOf( "Hello","Alaska","Dad","Peace" ) ) , arrayOf( "Alaska","Dad" ) )
        Assert.assertArrayEquals( findWords( arrayOf( "omk" ) ) , Array( 0 ){ ""} )
        Assert.assertArrayEquals( findWords( arrayOf( "adsdf","sfd" ) ) , arrayOf( "adsdf","sfd" ) )

    }
}