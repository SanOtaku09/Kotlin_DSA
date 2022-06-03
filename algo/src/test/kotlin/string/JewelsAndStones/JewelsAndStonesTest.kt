package string.JewelsAndStones

import org.junit.Assert
import org.junit.Test
import string.JewelsAndStones.JewelsAndStones.numJewelsInStones

class JewelsAndStonesTest {
    @Test
    fun test() {
        Assert.assertEquals( numJewelsInStones( "aA" , "aAAbbbb" ) , 3 )
        Assert.assertEquals( numJewelsInStones( "z" , "ZZ" ) , 0 )
    }
}