package string.CountingWordsWithAGivenPrefix

import org.junit.Assert
import org.junit.Test
import string.CountingWordsWithAGivenPrefix.CountingWordsWithAGivenPrefix.prefixCount

class CountingWordsWithAGivenPrefixTest {
    @Test
    fun test() {
        Assert.assertEquals( "at".prefixCount( arrayOf( "pay","attention","practice","attend" ) ) , 2 )
        Assert.assertEquals( "code".prefixCount( arrayOf( "leetcode","win","loops","success" ) ) , 0 )
    }
}