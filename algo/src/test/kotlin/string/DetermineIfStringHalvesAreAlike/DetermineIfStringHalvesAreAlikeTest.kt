package string.DetermineIfStringHalvesAreAlike

import org.junit.Assert
import org.junit.Test
import string.DetermineIfStringHalvesAreAlike.DetermineIfStringHalvesAreAlike.halvesAreAlike

class DetermineIfStringHalvesAreAlikeTest {
    @Test
    fun test() {
        Assert.assertEquals( halvesAreAlike( "book" ) , true )
        Assert.assertEquals( halvesAreAlike( "textbook" ) , false )
    }
}