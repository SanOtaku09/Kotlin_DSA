package string.CheckIfAllCharactersHaveEqualNumberOfOccurrences

import org.junit.Assert
import org.junit.Test
import string.CheckIfAllCharactersHaveEqualNumberOfOccurrences.CheckIfAllCharactersHaveEqualNumberOfOccurrences.areOccurrencesEqual

class CheckIfAllCharactersHaveEqualNumberOfOccurrencesTest {
    @Test
    fun test() {
        Assert.assertEquals( "abacbc".areOccurrencesEqual() , true )
        Assert.assertEquals( "aaabb".areOccurrencesEqual() , false )
    }
}