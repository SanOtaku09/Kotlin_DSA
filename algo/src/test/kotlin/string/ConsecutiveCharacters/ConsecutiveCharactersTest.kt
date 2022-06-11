package string.ConsecutiveCharacters

import org.junit.Assert
import org.junit.Test
import string.ConsecutiveCharacters.ConsecutiveCharacters.maxPower

class ConsecutiveCharactersTest {
    @Test
    fun test() {
        Assert.assertEquals( maxPower( "leetcode" ) , 2 )
        Assert.assertEquals( maxPower( "abbcccddddeeeeedcba" ) , 5 )
        Assert.assertEquals( maxPower( "ccbccbb" ) , 2 )
    }
}