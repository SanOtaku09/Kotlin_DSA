package string.CheckIfTheSentenceIsPangram

import org.junit.Assert
import org.junit.Test
import string.CheckIfTheSentenceIsPangram.CheckIfTheSentenceIsPangram.checkIfPangram

class CheckIfTheSentenceIsPangramTest {
    @Test
    fun test() {
        Assert.assertEquals( checkIfPangram( "thequickbrownfoxjumpsoverthelazydog" ) , true )
        Assert.assertEquals( checkIfPangram( "leetcode" ) , false )
    }
}