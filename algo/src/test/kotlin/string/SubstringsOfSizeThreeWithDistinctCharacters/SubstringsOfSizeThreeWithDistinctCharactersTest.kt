package string.SubstringsOfSizeThreeWithDistinctCharacters

import org.junit.Assert
import org.junit.Test
import string.SubstringsOfSizeThreeWithDistinctCharacters.SubstringsOfSizeThreeWithDistinctCharacters.countGoodSubstrings

class SubstringsOfSizeThreeWithDistinctCharactersTest {
    @Test
    fun test() {
        Assert.assertEquals( countGoodSubstrings("xyzzaz" ) , 1 )
        Assert.assertEquals( countGoodSubstrings( "aababcabc" ) , 4 )
    }
}