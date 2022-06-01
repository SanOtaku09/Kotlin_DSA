package string.DecryptStringFromAlphabetToIntegerMapping

import org.junit.Assert
import org.junit.Test
import string.DecryptStringFromAlphabetToIntegerMapping.DecryptStringFromAlphabetToIntegerMapping.freqAlphabets

class DecryptStringFromAlphabetToIntegerMappingTest {
    @Test
    fun test() {
        Assert.assertEquals( freqAlphabets( "10#11#12" ) , "jkab" )
        Assert.assertEquals( freqAlphabets( "1326#" ) , "acz" )
    }
}