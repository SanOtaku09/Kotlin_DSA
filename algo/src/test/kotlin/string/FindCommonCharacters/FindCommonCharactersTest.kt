package string.FindCommonCharacters

import org.junit.Assert
import org.junit.Test
import string.FindCommonCharacters.FindCommonCharacters.commonChars

class FindCommonCharactersTest {
    @Test
    fun test() {
        Assert.assertArrayEquals( commonChars( arrayOf( "bella","label","roller" ) ).toTypedArray() , arrayOf( "e" , "l" , "l" ) )
        Assert.assertArrayEquals( commonChars( arrayOf( "cool","lock","cook" ) ).toTypedArray() , arrayOf( "c" , "o" ) )
    }
}